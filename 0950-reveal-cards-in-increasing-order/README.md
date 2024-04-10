<h2><a href="https://leetcode.com/problems/reveal-cards-in-increasing-order/">950. Reveal Cards In Increasing Order</a></h2><h3>Medium</h3><hr><div data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally"><p data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">You are given an integer array <code data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">deck</code>. There is a deck of cards where every card has a unique integer. The integer on the <code data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">i<sup data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">th</sup></code> card is <code data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">deck[i]</code>.</p>

<p data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">You can order the deck in any order you want. Initially, all the cards start face down (unrevealed) in one deck.</p>

<p data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">You will do the following steps repeatedly until all cards are revealed:</p>

<ol data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">
	<li data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">Take the top card of the deck, reveal it, and take it out of the deck.</li>
	<li data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">If there are still cards in the deck then put the next top card of the deck at the bottom of the deck.</li>
	<li data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">If there are still unrevealed cards, go back to step 1. Otherwise, stop.</li>
</ol>

<p data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">Return <em data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">an ordering of the deck that would reveal the cards in increasing order</em>.</p>

<p data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally"><strong data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">Note</strong> that the first entry in the answer is considered to be the top of the deck.</p>

<p data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">&nbsp;</p>
<p data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally"><strong class="example hidden-originally" data-pf_style_display="none" data-pf_style_visibility="hidden">Example 1:</strong></p>

<pre data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally"><strong data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">Input:</strong> deck = [17,13,11,2,3,5,7]
<strong data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">Output:</strong> [2,13,3,11,5,17,7]
<strong data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">Explanation:</strong> 
We get the deck in the order [17,13,11,2,3,5,7] (this order does not matter), and reorder it.
After reordering, the deck starts as [2,13,3,11,5,17,7], where 2 is the top of the deck.
We reveal 2, and move 13 to the bottom.  The deck is now [3,11,5,17,7,13].
We reveal 3, and move 11 to the bottom.  The deck is now [5,17,7,13,11].
We reveal 5, and move 17 to the bottom.  The deck is now [7,13,11,17].
We reveal 7, and move 13 to the bottom.  The deck is now [11,17,13].
We reveal 11, and move 17 to the bottom.  The deck is now [13,17].
We reveal 13, and move 17 to the bottom.  The deck is now [17].
We reveal 17.
Since all the cards revealed are in increasing order, the answer is correct.
</pre>

<p data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally"><strong class="example hidden-originally" data-pf_style_display="none" data-pf_style_visibility="hidden">Example 2:</strong></p>

<pre data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally"><strong data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">Input:</strong> deck = [1,1000]
<strong data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">Output:</strong> [1,1000]
</pre>

<p data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">&nbsp;</p>
<p data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally"><strong data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">Constraints:</strong></p>

<ul data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">
	<li data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally"><code data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">1 &lt;= deck.length &lt;= 1000</code></li>
	<li data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally"><code data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">1 &lt;= deck[i] &lt;= 10<sup data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">6</sup></code></li>
	<li data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">All the values of <code data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">deck</code> are <strong data-pf_style_display="none" data-pf_style_visibility="hidden" class="hidden-originally">unique</strong>.</li>
</ul>
</div>