// 1.
// import React from "react";

// const App = (props) => {
//     return(
//         <div>
//             <h1>Заголовок - {props.title}</h1>
//             <div>Описание - {props.description}</div>
//         </div>
//     );
// };

// export default App;

// 2.

import React, { useEffect, useState } from "react";
import "./App.css";
import "./style.css";

const styles = {colore: 'blue', fontSize: '30px'}

export default function App() {
    const [number, setNumber] = useState(0);

    // пишем hook useEffect только в самом компоненте (не в функциях и ретёрне)
    // useEffect при монтировании компонента
    //         {callback}, [array]
    useEffect(() => {setNumber(Math.floor(Math.random() * 1000))}, [] );
    // useEffect при каждом срабатывании (обновлении) компонента
    // useEffect(() => {setNumber(Math.random() * 1000)});

    return (
        <div className="App">
            <h1 className="red big">Привет число!</h1>
            <h2 style={styles}>Я число - {number}</h2>
        </div>
    );
}