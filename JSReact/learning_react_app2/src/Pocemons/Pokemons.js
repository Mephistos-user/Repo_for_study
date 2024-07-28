import React, { useEffect, useState } from "react";
import "./Pokemons.css";

const Pokemons = () => {

    const [pokemons, setPokemons] = useState([]);

    const [isLoaded, setIsLoaded] = useState(true);

    const [newElement, setNewElement] = useState({name: "", url: ""});

    useEffect (() => {
        fetch('https://pokeapi.co/api/v2/pokemon?limit=10&offset=0')
        .then((data) => data.json())
        .then((res) => {
            console.log(res.results);
            setPokemons([...res.results]);
            setIsLoaded(true);
        });
    }, [isLoaded]);

    const deletePokemon = (pokemonName) => {
        const localPokemons = [...pokemons].filter((el) => el.name !== pokemonName);
        // * скопировать старый массив, если необходимо [...arr1, ...arr2].filter(....)
        // - изменить массив
        // - переприсвоить его состояние
        setPokemons(localPokemons);
    }

    const addElement = (ev,newEl) => {
        ev.preventDefault();
        const localPokemons = [...pokemons, newEl];
        setPokemons(localPokemons);
    };

    const onChangeNewEl = (value, type) => {
        // console.log(value, type, "value", "type");
        const newLocalEl = {...newElement};
        newLocalEl [type] = value;
        setNewElement(newLocalEl);
    }

    return (
        <div>
            <button onClick={() => setIsLoaded(false)}>обновить страницу</button>
            <div>
                <form className="poke-form">
                    <input type="text" placeholder="name" onChange={(ev) => onChangeNewEl(ev.target.value, 'name')}/>
                    <input type="text" placeholder="info" onChange={(ev) => onChangeNewEl(ev.target.value, 'url')} disabled={true}/>
                    <button onClick={(ev) => addElement(ev, newElement)}>
                        Добавить элемент
                    </button>
                </form>
            </div>
            {pokemons.map((el, index) => {
                return (
                    <div className="pokemons-item" key={index}>
                        <button onClick={() => deletePokemon(el.name)}>Удалить {el.name}</button>
                        <p className="pokemons-item__name">{el.name}</p>
                        <a className="pokemons-item__url" target="_blank"href={el.url}>Info about {el.name}</a>
                    </div>
                );
            })}
        </div>
    );
};

export default Pokemons;