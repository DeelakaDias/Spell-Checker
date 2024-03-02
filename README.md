# Spell-Checker

This repository contains a spell-checker application implemented in [insert programming language]. The application stores a lexicon of words in a set and provides a method called spellChecker(a), which performs a spell check on a given string 'a' with respect to the set of words.

If the input string 'a' is found in the lexicon, the spellChecker(a) method returns a list containing only 'a', assuming it is spelled correctly. However, if 'a' is not found in the lexicon, the method returns a list of potential correct spellings by considering common misspelling scenarios.

The spell-checker application handles various types of misspellings, including:

Swapping adjacent characters in a word
Inserting a single character between two adjacent characters in a word
Deleting a single character from a word
Replacing a character in a word with another character
By efficiently implementing these functionalities, the spell-checker helps users identify potential correct spellings for misspelled words, enhancing the accuracy of text processing and editing tasks.
