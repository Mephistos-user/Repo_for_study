// условный рендеринг по состоянию

import { useEffect, useState } from "react";



const Shape = () => {
    const [shape, setShape] = useState(null);
    const [randomNumber, setRandomNumber] = useState(null);
    useEffect(() => {
        const number = Math.floor(Math.random() * 100);
        setRandomNumber(number);
        if (randomNumber > 5) {
            setShape('circle');
        } else {
            setShape('sqrt');
        }
    }, []);

    return (
        <div>
            {shape === "sqrt" ?
             <div style={{
                width: "200px",
                height: "200px",
                background: "blue",
                color: "white",
                display: "flex",
                justifyContent: "center",
                alignItems: "center",
                }}>
                {randomNumber}
             </div> :
             <div style={{
                width: "200px",
                borderRadius: "50%",
                height: "200px",
                background: "red",
                color: "white",
                display: "flex",
                justifyContent: "center",
                alignItems: "center",
                }}>
                {randomNumber}
             </div>}
        </div>
    );
}

export default Shape;