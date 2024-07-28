import { Link, Route, Routes } from 'react-router-dom';

import About from './About/About';
import './App.css';
import ArrList from './Array/ArrList';
import Contacts from './Contacts/Contacts';
import Home from './Home/Home';
import UseHooks from './Hooks_2.0/Hooks_2';
import Pokemoms from './Pocemons/Pokemons';

function App() {
  return (
    <div className="App">
      <h1>Наше первое React приложение</h1>
      <div className='router-nav-container'>
        <nav className='navigation-menu'>
          <div className='navigation-menu__container'>
            <div>
              <Link to='/home' className='link'>Домой</Link>
            </div>
            <div>
              <Link to='/about' className='link'>О нас</Link>
            </div>
            <div>
              <Link to='/contacts' className='link'>Контакты</Link>
            </div>
            <div>
              <Link to='/hooks' className='link'>Hooks - 2.0</Link>
            </div>
            <div>
              <Link to='/list' className='link'>Array List</Link>
            </div>
            <div>
              <Link to='/pokemons' className='link'>Pokemons</Link>
            </div>
          </div>
        </nav>
      </div>
      <Routes>
        <Route path='/home' element={<Home />} />
        <Route path='/about' element={<About />} />
        <Route path='/contacts' element={<Contacts />} />
        <Route path='/hooks' element={<UseHooks />} />
        <Route path='/list' element={<ArrList />} />
        <Route path='/pokemons' element={<Pokemoms />} />
      </Routes>
    </div>
  );
}

export default App;
