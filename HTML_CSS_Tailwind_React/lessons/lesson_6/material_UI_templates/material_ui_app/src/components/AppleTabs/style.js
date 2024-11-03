import { Tab, Tabs, styled } from "@mui/material";

export const StyledTabs = styled(Tabs)(({theme}) => ({
    backgroundColor: '#eee',
    borderRadius: 10,
    minHeight: 44,
    '& .MuiTabs-flexContainer': {
        display: 'inline-flex',
        position: 'relative',
        zIndex: 1
    },
    '& .MuiTabs-scroller': {
        [theme.breakpoints.up('md')]: {
            padding: '0 8px',
        }
    },
    '& .MuiTabs-indicator': {
        top: 3,
        bottom: 3,
        right: 3,
        height: 'auto',
        background: 'none',
        '&:after': {
            content: '""',
            display: 'block',
            position: 'absolute',
            top: 0,
            left: 4,
            right: 4,
            bottom: 0,
            borderRadius: 8,
            backgroundColor: '#fff',
            boxShadow: '0 4px 12px 0 rgba(0, 0, 0, 0.16)',
        }
    }
}));

export const StyledTab = styled(Tab)(({theme}) => ({
    '&:hover': {
        opacity: 1
    },
    minHeight: 44,
    minWidth: 96,
    [theme.breakpoints.up('md')]: {
        minWidth: 120
    },
    '& .MuiTab-wrapper': {
        color: theme.palette.text.primary,
        textTransform: 'initial'
    }
}));