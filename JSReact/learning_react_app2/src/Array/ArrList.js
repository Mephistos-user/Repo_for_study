import React, { useState } from "react";

const ArrList = () => {

    const [numbers, setNumbers] = useState(['1', '2', '3', '4', '5']);

    return (
        <div>
            <p>Hello i'm Array list</p>
            <div>
                <ul>
                    {numbers.map((el, index) => {
                        return <li key={index}>{el}</li>
                    })}
                </ul>
            </div>
        </div>
    )
};

export default ArrList;