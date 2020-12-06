const $menu = document.querySelector('.menu');
const $btnMenuOpen = document.querySelector('.btnMenu_open');
const $btnMenuClose = document.querySelector('.btnMenu_close')

$btnMenuOpen.addEventListener('click', function(){
	$menu.classList.add('menu_open')
})

$btnMenuClose.addEventListener('click', function(){
	$menu.classList.remove('menu_open')
});

const $menuCustomer= document.querySelector('.menuCustomer');
const $btnMenu_openCustomer = document.querySelector('.btnMenu_openCustomer')

$btnMenu_openCustomer.addEventListener('click', function(){
	$menuCustomer.classList.add('menuCustomer_open')
})

