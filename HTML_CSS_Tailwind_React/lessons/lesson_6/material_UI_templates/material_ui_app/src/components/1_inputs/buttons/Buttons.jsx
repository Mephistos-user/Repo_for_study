import AddShoppingCartIcon from '@mui/icons-material/AddShoppingCart';
import AlarmIcon from '@mui/icons-material/Alarm';
import DeleteIcon from '@mui/icons-material/Delete';
import Fingerprint from '@mui/icons-material/Fingerprint';
import SendIcon from '@mui/icons-material/Send';

import { Stack } from '@mui/material';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';

export const Buttons = () => {

    return (
        <>
            <Button variant="text" component="a" href="#" >Text</Button>
            <Button variant="contained" >Contained</Button>
            <Button variant="contained" size="large">large</Button>
            <Button variant="contained" size="medium">medium</Button>
            <Button variant="contained" size="small">small</Button>
            <Button variant="outlined">Outlined</Button>
            <Button>Primary</Button>
            <Button disabled>Disabled</Button>
            <Button href="#text-buttons">Link</Button>
            <Button variant="contained">Contained</Button>
            <Button variant="contained" disabled>Disabled</Button>
            <Button variant="contained" href="#contained-buttons">Link</Button>
            <Button variant="contained" disableElevation>Disable elevation</Button>
            <Button variant="outlined">Primary</Button>
            <Button variant="outlined" disabled>Disabled</Button>
            <Button variant="outlined" href="#outlined-buttons">Link</Button>
            <Button onClick={() => {alert('clicked');}}>Click me</Button>
            <Button color="secondary">Secondary</Button>
            <Button variant="contained" color="primary">primary</Button>
            <Button variant="contained" color="secondary">secondary</Button>
            <Button variant="contained" color="success">success</Button>
            <Button variant="contained" color="warning">warning</Button>
            <Button variant="contained" color="error">error</Button>
            <Button variant="contained" color="info">info</Button>
            <Button variant="contained" color="inherit">inherit</Button>
            <Button variant="outlined" color="error">Error</Button>
            <Stack direction="row" spacing={2}>
            <Button variant="outlined" startIcon={<DeleteIcon />}>
                Delete
            </Button>
            <Button variant="contained" endIcon={<SendIcon />}>
                Send
            </Button>
            </Stack>
            
            <Stack direction="row" spacing={1}>
                <IconButton aria-label="delete">
                    <DeleteIcon />
                </IconButton>
                <IconButton aria-label="delete" disabled color="primary">
                    <DeleteIcon />
                </IconButton>
                <IconButton color="secondary" aria-label="add an alarm">
                    <AlarmIcon />
                </IconButton>
                <IconButton color="primary" aria-label="add to shopping cart">
                    <AddShoppingCartIcon />
                </IconButton>
            </Stack>

            <Stack direction="row" spacing={1}>
                <IconButton aria-label="fingerprint" color="secondary">
                    <Fingerprint />
                </IconButton>
                <IconButton aria-label="fingerprint" color="success">
                    <Fingerprint />
                </IconButton>
            </Stack>

            {/* <Stack direction="row" spacing={2}>
                <LoadingButton loading variant="outlined">
                    Submit
                </LoadingButton>
                <LoadingButton loading loadingIndicator="Loading…" variant="outlined">
                    Fetch data
                </LoadingButton>
                <LoadingButton
                    loading
                    loadingPosition="start"
                    startIcon={<SaveIcon />}
                    variant="outlined"
                >
                    Save
                </LoadingButton>
            </Stack> */}
        </>
    )
}