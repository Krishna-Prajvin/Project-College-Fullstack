

const Modal = () => {
 
  return (
    <aside className='modal-container'>
      <div className='modal'>
        <h4>Do you wish to remove all items in the shopping cart?</h4>
        <div className='btn-container'>
          <button
            type='button'
            className='btn confirm-btn'
          
          >
            Remove Items
          </button>
          <button
            type='button'
            className='btn clear-btn'
          
          >
            Cancel
          </button>
        </div>
      </div>
    </aside>
  );
};
export default Modal;
