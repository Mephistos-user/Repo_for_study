import React, { useEffect, useState } from "react";

// 9.

const MyComponent4 = (props) => {

    const [stateValue, setStateValue] = useState(props.propValue);

    useEffect(() => {
        setStateValue(props.propValue);
    }, [props.propValue])

    return (
        <div>
            <p>Props - {props.propValue}</p>
            <p>State - {stateValue}</p>
            <button onClick={() => setStateValue('0')}>Изменить состояние</button>
        </div>
    );
};

export default MyComponent4;