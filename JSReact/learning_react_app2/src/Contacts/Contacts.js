import React, { useEffect, useState } from "react";
import './Contacts.css';

const Contacts =() => {

    const [dataFromApi, setDataFromApi] = useState(null);

    const [isLoaded, setIsLoaded] = useState(false);

    const [userName, setUserName] =useState('');

    const [isDeleted, setIsDeleted] = useState(false);

    useEffect(() => {
        console.log(isLoaded);
    },[isLoaded]);

    const fetchData = (data) => {
        // fetch('https://jsonplaceholder.typicode.com/posts', {
        //     method: "POST",
        fetch('https://jsonplaceholder.typicode.com/posts/1', {
            method: "PUT",
            body: JSON.stringify({
                title: data,
                body: 'body',
            }),
        }).then((data) => data.json())
        .then((res) => {
            setDataFromApi(res.id);
            setIsLoaded(true);
        });
    };

    const onChangeOurInput = (ev) => {
        if (ev.target.value.length > 3) {
            setUserName(ev.target.value);
            fetchData(ev.target.value);
        }
    };

    const deleteUser = (userNameLocal) => {
        fetch(`https://jsonplaceholder.typicode.com/posts/${dataFromApi}`, {
            method: "DELETE",
        }).then(() => setIsDeleted(true));
    }

    return (
        <div className="contacts-page-container container">
            <p className="contacts-page-container__head-text">Контакты</p>
            <div>
                <p>введите ваши данные</p>
                <input type="text" onChange={(ev) => onChangeOurInput(ev)}/>
            </div>
            <div>
                {isLoaded ? <p>Ваш ID</p> : <p>Ваш ID еще не загружен</p>}
                {isLoaded && <p>ID - {dataFromApi}</p>}
            </div>
            {isLoaded && (<div>
                <button onClick={() => deleteUser()}>
                    {isDeleted ? "Пользователь удален" : `Удалить пользователя - ${userName}`}
                </button>
            </div>)}
        </div>
    );
};

export default Contacts;