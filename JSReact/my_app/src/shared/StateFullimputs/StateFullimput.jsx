import React, { useState } from "react";

const FullImput = ({localType}) => {

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
                    <input type="date" className={isValid ? 'valid' : 'not-valid'} onChange={(ev) => isValidDate(ev.target.value)}/>
                </>
            )
        case 'password':
            return (
                <input type="password" className={isValid ? 'not-valid' : 'valid'}/>
            )

    }
};

export default FullImput;
