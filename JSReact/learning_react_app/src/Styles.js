


export const MyComponent = (props) => {
    
    const disabled = props.disabled;
    
    return (
        <div>
            <button className={disabled && "disabled"}>Click Me</button>
        </div>
    )
};

const Button = (props) => {

    const active = props.active;

    return (
        <>
        <button className={active ? "active" : ""}>Click Me</button>
        </>
    )
};

export default Button;

export const Login = (props) => {
    const isLogged = props.isLogged;

    return (
        <div>
            {
                isLogged ? <button className="Yes">Yes</button>
                :
                <button className="No">No</button>
            }
        </div>
    )
};
