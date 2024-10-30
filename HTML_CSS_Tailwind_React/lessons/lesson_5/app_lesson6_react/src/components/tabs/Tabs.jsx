// import './tabs.css';
import styles from './tabs.module.css';

export const Tabs = () => {
    console.log(styles, 'Tabs')
    return (
        <>
            <div className="tabs-container">
                <button className="tabs-item">Архив новостей</button>
                <button className="tabs-item">Организации</button>
                <button className="tabs-item">Организации</button>
                <button className="tabs-item">Организации</button>
                <button className="tabs-item">Организации</button>
            </div>
        </>
    )
}