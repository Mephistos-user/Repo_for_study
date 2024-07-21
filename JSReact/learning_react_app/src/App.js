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

// import React, { useEffect, useState } from "react";
// import "./App.css";
// import "./style.css";

// const styles = {colore: 'blue', fontSize: '30px'}

// export default function App() {
//     const [number, setNumber] = useState(0);

//     // пишем hook useEffect только в самом компоненте (не в функциях и ретёрне)
//     // useEffect при монтировании компонента
//     //         {callback}, [array]
//     useEffect(() => {setNumber(Math.floor(Math.random() * 1000))}, [] );
//     // useEffect при каждом срабатывании (обновлении) компонента
//     // useEffect(() => {setNumber(Math.random() * 1000)});

//     return (
//         <div className="App">
//             <h1 className="red big">Привет число!</h1>
//             <h2 style={styles}>Я число - {number}</h2>
//         </div>
//     );
// }

// 3.

// import "./style.css";
// import UserList from "./UserList";


// export default function App() {
//     return (
//         <div className="App">
//             <UserList></UserList>
//         </div>
//     )
// }

// 4. 5.

// import MyComponent from "./MyComponent";
// import "./style.css";

// export default function App() {
//     return (
//         <div className="App">
//             {/* 4. */}
//             {/* <MyComponent prop1={'props-1'} prop2={'props-2'}/> */}
//             {/* 5. */}
//             <MyComponent/>
//         </div>
//     );
// };

// 6. 7.

// import React from "react";
// import MyComponent2 from "./MyComponent2";

// const App = (props) => {
//     return (
//         <div>
//             <h1>Привет мир</h1>
//             <MyComponent2/>
//         </div>
//     );
// };

// export default App;

// 8.

// import React from "react";
// import List from "./MyComponent3";

// const App = (props) => {
//     return (
//         <div>
//             <h1>Привет мир</h1>
//             <List item={['item-0', 'item-1', 'item-2']}/>
//         </div>
//     );
// };

// export default App;

// 9.

import React from "react";
import MyComponent4 from "./MyComponent4";

const App = (props) => {
    return (
        <div>
            <h1>Привет мир</h1>
            <MyComponent4 propValue={'prop value 2'}/>
        </div>
    );
};

export default App;