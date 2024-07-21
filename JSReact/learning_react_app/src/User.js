// 3.

import React from "react";

const User = (props) => {
    return (
        // в реакте есть возможность передачи по ключу (id)
        <div key={props.id}>
            <h2>{props.name}</h2>
            <p>{props.email}</p>
        </div>
    )
}

export default User;