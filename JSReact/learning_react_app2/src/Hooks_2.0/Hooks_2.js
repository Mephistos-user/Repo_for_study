import React, { useCallback, useMemo, useRef, useState } from "react";

const UseHooks = () => {

    const [counter, setCounter] = useState(0);

    // useMemo - кеширует резульат
    let total = useMemo(() => {
        // alert(counter)
        let result = 0;

        // благодаря useMemo рендер после сложных вычислений происходит один раз и сохраненное значение вычислений не пересчитывается при ререндере
        for (let i = 0; i <= 10; i++) {
            result += i;
        }
        return result;

    }, [counter]);


    // useCallback - кеширует функцию
    const [isOpened, setIsOpened] = useState(false);

    const handleClick = useCallback(() => {
        console.log('onClick', counter);
        setCounter(() => counter + 1);
    // // }, [counter]); // - в этом при изменении отслеживаемого значения counter происходит ререндеринг и отрисовывается текущее значения counter
    }, []); // в этом случае при изменении отслеживаемого значения counter ререндеринг не происходит и текущее значения counter не отрисовывается


    // useRef - кеширует элементы DOM и позволяет работать с ними без дополнительного рендеринга
    const inputRef = useRef(null);

    const handleFocusImput = () => {
        // inputRef.current.focus(); // ставит фокус в поле ввода

        setCounter(() => counter + 1);
        inputRef.current.value = counter + 1; // вставляет значение в поле ввода
    };

    return (
        <div>
            <p>Страница для работы с хуками оптимизации</p>
            <div>
                <input type="text" ref={inputRef}/>
                <p>Total - {total}</p>
                <p>Counter - {counter}</p>
                <button onClick={handleClick}>
                    Увеличить счетчик
                </button>
                <button onClick={() => setIsOpened(!isOpened)}>
                    {isOpened ? 'Закрыть' : 'Открыть'}
                </button>
                {isOpened && <div>
                    Hello
                </div>}
            </div>
            <button onClick={handleFocusImput}>Кнопка импута</button>
        </div>
    )
};

export default UseHooks;