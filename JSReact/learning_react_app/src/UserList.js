// 3.

import React from "react";
import User from "./User";

const UserList = () => {

    const users = [
        // id не отображается, а используется только для внутренних механизмов реакта
        { id: 1, name: 'John', email: 'john@example.com' },
        { id: 2, name: 'Jane', email: 'jane@example.com' },
        { id: 3, name: 'Bob', email: 'bob@example.com' }
    ];

    return (
        <div>
            <h1>User List</h1>
            {users.map((user, index) => {
                return <User id={user.id} name={user.name} email={user.email}/>
            })}
            {/* или так: */}
            {/* {users.map((user, index) => 
                <User id={user.id} name={user.name} email={user.email}/>
            )} */}
        </div>
    )
}

export default UserList;