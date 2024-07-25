// Условный рендеринг по условию (props)

// Вариант 1 (через if else):

// import { LoginForm } from './LoginForm';
// import { WelcomMessage } from './WelcomMessage';

// const MyApp = (props) => {
//     const {isLoggedIn} = props;
//     if (isLoggedIn) {
//         return <WelcomMessage />;
//     } else {
//         return <LoginForm />;
//     }
// };

// export default MyApp;

// Вариант 2 (через тернарный оператор):

// import { LoginForm } from './LoginForm';
// import { WelcomMessage } from './WelcomMessage';

// const MyApp = (props) => {
//     const {isLoggedIn} = props;

//     return (
//     <div>
//         {isLoggedIn ? <WelcomMessage /> : <LoginForm />}
//     </div>
//     )
// };

// export default MyApp;

// Пример:

// export const MyText = (props) => {
//     const {text} = props;

//     return (
//         <div>
//             {/* если text есть, то отобразится абзац <p>, иначе ничего не отобразится */}
//             {text && <p>{text}</p>}
//         </div>
//     )
// }

// Вариант 3

import DefaultComponent from './DefaultComponent';
import Option1Component from './Option1Component';
import Option2Component from './Option2Component';

export const Renderer = (props) => {
    const {value} = props;
    switch (value) {
        case 'option-1':
            return <Option1Component/>;
        case 'option-2':
            return <Option2Component/>;
        default:
            return <DefaultComponent/>;
    }
};