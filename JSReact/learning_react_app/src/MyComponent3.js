import React, { useState } from "react";

// 8.

const List = (props) => {

    const [item, setItem] = useState(props.item);

    function addItem(localItem) {
        setItem([...item, localItem]);
    }

    return (
    <div>
        <ul>
            {item.map((el, index) => {
                return <li key={index}>{el}</li>
            })}
        </ul>
        <button onClick={() => addItem('item-3')}>
            Add item</button>
    </div>
    );
};

export default List;