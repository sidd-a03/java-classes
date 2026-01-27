## 📑 Index of Experiments

| Exp No | Experiment Name / Problem Statement |
|:------:| :--- |
| **01** | [Supermarket Problem (Product of Digits)](#exp-01-supermarket-problem) |
| **02** | [Count Elements Greater Than Prior](#exp-02-count-elements-greater-than-prior) |
| **03** | [Maya's Confidential Array (Decoding)](#exp-03-mayas-confidential-array-decoding) |

---

## 💻 Laboratory Work

### Exp 01: Supermarket Problem
<details>
<summary><b>Click to view Problem & Examples</b></summary>
<br>

#### ❓ Problem Statement
> **Scenario:** A Supermarket maintains a pricing format for all its products. A number "**N**" is printed on each product. When the scanner reads N, the price of the item is calculated as the **product of all digits** of N.
>
> **Task:** Write a Java program to accept N and calculate the final price.

#### 🔢 Input & Output Examples
| Type | Data |
| :--- | :--- |
| **Input** | `253` |
| **Output** | `30` (Logic: 2 × 5 × 3) |
| **Input** | `105` |
| **Output** | `0` (Logic: 1 × 0 × 5) |

</details>

---

### Exp 02: Count Elements Greater Than Prior
<details>
<summary><b>Click to view Problem & Examples</b></summary>
<br>

#### ❓ Problem Statement
> **Task:** Given an integer array `arr` of size `n`, find the count of elements whose value is **greater than all of its prior elements**.
>
> **Note:** The first element of the array should always be included in the count.

#### 🔢 Input & Output Examples
| Type | Data |
| :--- | :--- |
| **Input** | `7, 4, 8, 2, 9` |
| **Output** | `3` |
| **Explanation** | - **7** is included (First element).<br>- 4 is not > 7.<br>- **8** is > 7 (Included).<br>- 2 is not > 8.<br>- **9** is > 8 (Included).<br>**Count = 3** |

</details>

---

### Exp 03: Maya's Confidential Array (Decoding)
<details>
<summary><b>Click to view Problem & Examples</b></summary>
<br>

#### ❓ Problem Statement
> **Scenario:** Maya has stored a few confidential numbers in an array. To ensure secrecy, she applied a simple encoding:
> * Each element `arr[i]` is replaced by the **sum of its original value and the next element's original value**:
    >   * `encoded[i] = original[i] + original[i+1]`
> * The **last element** remains unchanged.
>
> **Task:** Given the **encoded array**, write a program to find:
> 1. The **First Number** in the original array.
> 2. The **Sum** of all numbers in the original array.

#### 🔢 Input & Output Examples
| Type | Data |
| :--- | :--- |
| **Input (Encoded)** | `22, 16, 5` |
| **Logic (Decoding)** | 1. **Last Element:** `5` (Unchanged)<br>2. **2nd Element:** `16 - 5 = 11`<br>3. **1st Element:** `22 - 11 = 11`<br>**Original Array:** `[11, 11, 5]` |
| **Output** | **First Number:** `11`<br>**Sum:** `27` (11+11+5) |

</details>

---