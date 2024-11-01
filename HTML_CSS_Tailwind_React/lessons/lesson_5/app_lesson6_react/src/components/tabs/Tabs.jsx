// import styles from './tabs.module.scss';
import { StyledTabsContainer, StyledTabsItem } from "./style";

export const Tabs = () => {

    // const classes = styles()
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
        <StyledTabsContainer>
            <StyledTabsItem >Архив новостей</StyledTabsItem>
            <StyledTabsItem >Организации</StyledTabsItem>
            <StyledTabsItem >Организации</StyledTabsItem>
            <StyledTabsItem >Организации</StyledTabsItem>
            <StyledTabsItem >Организации</StyledTabsItem>
        </StyledTabsContainer>
        </>





        // <>
        // <div className={classes.container}>
        //     <button className={classes.item}>Архив новостей</button>
        //     <button className={classes.item}>Организации</button>
        //     <button className={classes.item}>Организации</button>
        //     <button className={classes.item}>Организации</button>
        //     <button className={classes.item}>Организации</button>
        // </div>
        // </>
    )
}