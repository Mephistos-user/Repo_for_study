// import styles from './tabs.module.scss';
import { styles } from "./style";

export const Tabs = () => {

    const classes = styles()
    return (
        // <>
        //     <div className={styles.container}>
        //         <button className={styles.item + " red"}>Архив новостей</button>
        //         <button className={styles.item}>Организации</button>
        //         <button className={styles.item}>Организации</button>
        //         <button className={`red ${styles.item}`}>Организации</button>
        //         <button className={styles.item}>Организации</button>
        //     </div>
        // </>

        <>
        <div className={classes.container}>
            <button className={classes.item}>Архив новостей</button>
            <button className={classes.item}>Организации</button>
            <button className={classes.item}>Организации</button>
            <button className={classes.item}>Организации</button>
            <button className={classes.item}>Организации</button>
        </div>
        </>
    )
}