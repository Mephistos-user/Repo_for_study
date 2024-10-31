import styles from './tabs.module.css';

export const Tabs = () => {
    return (
        <>
            <div className={styles.container}>
                <button className={styles.item}>Архив новостей</button>
                <button className={styles.item}>Организации</button>
                <button className={styles.item}>Организации</button>
                <button className={styles.item}>Организации</button>
                <button className={styles.item}>Организации</button>
            </div>
        </>
    )
}