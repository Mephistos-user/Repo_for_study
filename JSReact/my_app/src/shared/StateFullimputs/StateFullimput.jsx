import React, { useState } from "react";

const FullImput = ({localType, placeholder, propsName}) => {

    const [isValid, setIsValid] = useState(false);

    const [disabled, setDisabled] = useState(false);

    const isValidDate = (date) => {
        setDisabled(date.split('-')[0] < 2005);
    }

    switch (localType) {
        case 'date':
            return (
                <>
                    {disabled && <label>Вы младше 18 лет, к сожалению задача для Вас недоступна</label>}
                    <input name={propsName} type="date" className={isValid ? 'not-valid' : 'valid'} onChange={(ev) => isValidDate(ev.target.value)}/>
                </>
            );
        case 'password':
            return (
                <input name={propsName} type="password" className={isValid ? 'not-valid' : 'valid'}/>
            );
        case 'text-area':
            return (
                <textarea name={propsName} placeholder={placeholder} className="textarea"></textarea>
            );
    }
};

export default FullImput;
