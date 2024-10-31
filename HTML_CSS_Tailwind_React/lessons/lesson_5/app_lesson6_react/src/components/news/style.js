import { createUseStyles } from 'react-jss'

export const styles = createUseStyles ({
    container: {
        display: 'grid',
        gridTemplateColumns: '1fr 1fr 1fr',
        gap: 15
    },
    item__image: {
        maxWidth: '100%',
        height: 185,
        objectFit: 'cover'
    }
})