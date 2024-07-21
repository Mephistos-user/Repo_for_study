
import React, { useEffect, useState } from "react";

// 4.
// const MyComponent = (props) => {

//     // способ деструктуризации:
//     const { prop2 } = props;

//     return (
//         <>
//             <p>{props.prop1}</p>
//             {/* тоже самое, но с применением деструктуризации: */}
//             <p>{prop2}</p>
//         </>
//     )

// };

// export default MyComponent;


// 5.

// инициализация состояния
const initialState = () => {
    return 0;
}

// hook - useState - получение текущего состояния компонента в виде объекта (counter) и функция для его изменения (setCounter)
const MyComponent = (props) => {

        const [counter, setCounter] = useState(initialState);

        const [isOpened, setIsOpened] = useState(false);
        
        const [x, setX] = useState(1);

        // const handlerSetCounter = () => {
        //     setCounter(counter + 1);
        // }

        const handlerMouseMove = (event) => {
            setX(event.clientX);
        }

        useEffect(() => {
            // document.body.addEventListener('mousemove', (event) => {
            //     setX(window.event.clientX);
            // });
        }, []);
    
        return (
            <div>
                {/* можно так (для читаемости): */}
                {/* <button onClick={() => handlerSetCounter()}>Click Me</button> */}
                {/* или так (проще): */}
                <button onClick={() => setCounter(counter + 1)}>Click Me</button>
                <button onClick={() => setIsOpened(!isOpened)}>
                    {isOpened ? 'Скрыть строку' : 'Показать строку'}
                </button>
                <p>Counter: {counter}</p>
                {isOpened &&
                    <div>
                        <span>Это строка, всем привет</span>
                    </div>}
                <div onMouseMove={(event) => handlerMouseMove(event)}>
                    Координаты мыши (X) - {x}
                </div>
            </div>
        )
    
    };
    
    export default MyComponent;