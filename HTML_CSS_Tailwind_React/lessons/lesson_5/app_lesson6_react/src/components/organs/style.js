import { createUseStyles } from 'react-jss'

export const styles = createUseStyles ({
    container: {
        display: 'grid',
        gridTemplateColumns: '1fr 1fr',
        gap: 15,
    },
    item: {
    paddingBottom: 10,
    marginBottom: '-60px',
    },
    item__cover: {
        maxWidth: '100%',
        height: 120,
        backgroundColor: '#d9d9d9',
    },
    item__logo: {
        width: 140,
        height: 140,
        objectFit: 'cover',
    },
    text: {
        position: 'relative',
        bottom: 80,
        left: 30,
    }
})