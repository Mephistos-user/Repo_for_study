import './App.css';
import { Inputs } from './components/1_inputs/Inputs';
import AppleTabs from './components/AppleTabs/Tabs';
import GithubButtons from './components/GithubButtons/Buttons';

function App() {
  return (
    <>
      <h1>BUTTONS</h1>
      <div className='container'>
        <Inputs/>
      </div>
      <h1>APPLE TABS</h1>
      <AppleTabs />
      <h1>GITHUB BUTTONS</h1>
      <GithubButtons />
    </>

  );
}

export default App;
