import { createUseStyles } from 'react-jss'

export const styles = createUseStyles ({
    container: {
        display: 'flex',
        flexWrap: 'wrap',
        gap: 15,
        alignItems: 'center'
    },
    item: {
        fontSize: 14,
        borderRadius: 27,
        padding: '13px 34px',
        border: '1px solid white',
        backgroundColor: 'transparent',
        color: 'inherit'
    }
})