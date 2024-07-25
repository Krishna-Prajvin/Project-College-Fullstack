import { useSelector } from 'react-redux';
import CartItem from './CartItem';
const CartContainer = () => {
  const {cartItems }=useSelector((store)=>store.cart)
  return (
    <section className='cart'>
      <header>
        <h2>Cart Contents</h2>
      </header>
      <div>
        {cartItems.map((item) => {
          return <CartItem key={item.id} {...item} />;
        })}
      </div>
      <footer>
        <hr />
        <div className='cart-total'>
          <h4>
            Total <span>₹ 0</span>
          </h4>
        </div>
        <button className='btn clear-btn'>
          Clear
        </button>
      </footer>
    </section>
  );
};
export default CartContainer;