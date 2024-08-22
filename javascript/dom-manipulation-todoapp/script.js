const input = document.querySelector("input");
const submitForm = document.getElementById("form");
const itemLists = document.querySelector("ul");

submitForm.addEventListener('submit', (event) => {
	const inputItem = input.value;
	input.value = "";

	const itemCard = document.createElement("div");
	const cardLabel = document.createElement("span");
	const cardAction = document.createElement("button");
	document.get

	itemCard.appendChild(cardLabel);
	cardLabel.textContent = inputItem;
	itemCard.appendChild(cardAction);
	cardAction.textContent = "Remove";
	itemLists.appendChild(itemCard);

	cardAction.addEventListener("click", () => {
		itemLists.removeChild(itemCard);
	});

	input.focus();
	event.preventDefault();
});
