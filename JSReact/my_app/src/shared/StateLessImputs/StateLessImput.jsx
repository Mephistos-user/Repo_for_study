import React from "react";

const LessImput = ({type, placeholder, label, classes, isData, onChangeProps, propsName}) => {
    
    return (
        <input name={propsName} type={type} placeholder={placeholder} className={classes} onChange={(ev) => onChangeProps(ev.target.value)} />
    )
};

export default LessImput;