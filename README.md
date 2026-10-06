# 📚 Statistical N-Gram Language Model & Text Processor

A standalone, pure **Java** statistical language model implementing Unigram, Bigram, and Trigram frequency mapping, maximum likelihood estimation (MLE), and corpus perplexity evaluation.

The system tokenizes unstructured literary text, extracts continuous n-gram probability distributions, and evaluates text likelihood without external NLP frameworks.

---

## 📌 Features

- **Text Pipeline & Tokenization:** Custom file ingestion handling casing normalization, punctuation stripping, and whitespace segmentation.
- **N-Gram Estimation:** Frequency mapping and probability estimation for $N \in \{1, 2, 3\}$.
- **Statistical Scoring:** Sentence likelihood calculation and perplexity evaluation across multi-part corpora.
- **Zero-Dependency Architecture:** Built entirely on standard Java Collections (`HashMap`, `ArrayList`) for transparency and algorithmic efficiency.

---

## 🏛️ Project Structure

```text
ngram-language-model/
├── data/                           # Literary corpora and test datasets
│   ├── grimms-fairy-tales_*.txt
│   ├── B INDA.txt
│   └── DE M.txt
├── src/
│   └── nlp1/
│       ├── FileProcessor.java      # Corpus loading, cleaning, and tokenization
│       ├── NGramGenerator.java     # N-gram generation and probability logic
│       └── Main.java               # Execution pipeline and benchmarking
├── Report.pdf                      # Comprehensive experimental evaluation
├── .gitignore
└── README.md
```

---

## 🚀 Getting Started

Compile and run via command line:

```bash
# Compile
javac -d bin src/nlp1/*.java

# Run
java -cp bin nlp1.Main
```