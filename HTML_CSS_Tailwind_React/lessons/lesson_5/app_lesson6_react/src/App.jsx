import './App.scss';
import { News } from './components/News';
import { Organs } from './components/Organs';
import { Tabs } from './components/Tabs';

function App() {
  return (
    <>
      <div className="container">
        <Tabs />
        <h2 className="block__heading">Архив новостей</h2>
        <News />
        <h2 className="block__heading">Организации</h2>
        <Organs />
      </div>
    </>
  );
}

export default App;
