const input = document.querySelector("input");
const submitForm = document.getElementById("form");
const itemLists = document.querySelector("ul");

submitForm.addEventListener('submit', (event) => {
	const inputItem = input.value;
	input.value = "";

	const listItem = document.createElement("li");
	const listAction = document.createElement("button");
	listAction.className = "remove-list";
	
	listItem.textContent = inputItem;
	listAction.textContent = "Remove";
	listItem.appendChild(listAction);
	itemLists.appendChild(listItem);

	itemLists.insertAdjacentElement("afterbegin", listItem);

	listAction.addEventListener("click", () => {
		itemLists.removeChild(listItem);
	});

	input.focus();
	event.preventDefault();
});
