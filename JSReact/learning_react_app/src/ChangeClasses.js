import React, { useState } from "react";

const MyInput = (props) => {

    const [isValid, setIsValid] = useState(false);

    const handleOnChange = (event) => {
        const inputEvent = event.target.value;
        const isValidValue = inputEvent.length > 5;
        setIsValid(isValidValue);
    };

    const styles = {
        border: isValid ? '2px solid green' : '2px solid red',
        padding: '5px',
        borderRadius: '10px',
    }
    return (
        <div>
            <label>{props.label}</label>
            <br/>
            <input type="text" style={styles} onChange={handleOnChange}/>
            {isValid ? null : <p>Введите 6 или более символов</p>}
        </div>
    )
};

export default MyInput;