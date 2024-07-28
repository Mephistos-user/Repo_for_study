import React from "react";

const LessImput = ({type, placeholder, label, classes, isData, onChangeProps}) => {
    
    return (
        <input type={type} placeholder={placeholder} className={classes} onChange={(ev) => onChangeProps(ev.target.value)} />
    )
};

export default LessImput;