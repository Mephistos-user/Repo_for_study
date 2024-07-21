// 1.
import { StrictMode } from "react";
import { createRoot } from "react-dom/client";

import App from "./App";

const rootElement = document.getElementById("root");
const root = createRoot(rootElement);

root.render(
    <StrictMode>
        <App title="Hello I'm title" description="Hello I'm description"/>
    </StrictMode>
);