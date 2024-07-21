import { useEffect, useState } from "react";

const MyComponent2 = () => {

// 6.
    // const [name, setName] = useState('');

    // useEffect(() => {
    //     console.log(`Имя изменено на - ${name}`);
    // }, [name]);

    // return (
    //     <div>
    //         {name && <h2>Привет - {name}</h2>}
    //         <input value={name} onChange={(event) => setName(event.target.value)} placeholder={'введите имя'}/>
    //     </div>
    // );

// 7.
    const [counter, setCounter] = useState(0);

    useEffect(() => {
        // применение интервалов:
        const intervalId = setInterval(() => {
            setCounter(counter => counter + 1);
        }, 1000);

        return () => clearInterval(intervalId);

    }, []);

    return (
        <div>
            <p>Counter: {counter}</p>
        </div>
    );

};

export default MyComponent2;