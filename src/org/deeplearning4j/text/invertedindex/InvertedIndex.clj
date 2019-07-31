(ns org.deeplearning4j.text.invertedindex.InvertedIndex
  "An inverted index for mapping words to documents
 and documents to words"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.invertedindex InvertedIndex]))

(defn all-docs
  "Returns a list of all documents

  returns: the list of all documents - `int[]`"
  ([^InvertedIndex this]
    (-> this (.allDocs))))

(defn document-with-label
  "Returns a list of words for a document
  and the associated label

  index - `int`

  returns: `org.nd4j.linalg.primitives.Pair<java.util.List<T>,java.lang.String>`"
  (^org.nd4j.linalg.primitives.Pair [^InvertedIndex this ^Integer index]
    (-> this (.documentWithLabel index))))

(defn add-labels-for-doc
  "Add word to a document

  doc - the document to add to - `int`
  word - the word to add - `java.util.List`"
  ([^InvertedIndex this ^Integer doc ^java.util.List word]
    (-> this (.addLabelsForDoc doc word))))

(defn cleanup
  "Cleanup any resources used"
  ([^InvertedIndex this]
    (-> this (.cleanup))))

(defn num-documents
  "Returns the number of documents

  returns: `int`"
  (^Integer [^InvertedIndex this]
    (-> this (.numDocuments))))

(defn add-word-to-doc
  "Add word to a document

  doc - the document to add to - `int`
  word - the word to add - `T`"
  ([^InvertedIndex this ^Integer doc word]
    (-> this (.addWordToDoc doc word))))

(defn each-doc-with-label
  "Iterate over each document with a label

  func - the function to apply - `com.google.common.base.Function`
  exec - executor service for execution - `java.util.concurrent.Executor`"
  ([^InvertedIndex this ^com.google.common.base.Function func ^java.util.concurrent.Executor exec]
    (-> this (.eachDocWithLabel func exec))))

(defn add-words-to-doc
  "Adds words to the given document

  doc - the document to add to - `int`
  words - the words to add - `java.util.List`
  label - the label for the document - `java.lang.String`"
  ([^InvertedIndex this ^Integer doc ^java.util.List words ^java.lang.String label]
    (-> this (.addWordsToDoc doc words label)))
  ([^InvertedIndex this ^Integer doc ^java.util.List words]
    (-> this (.addWordsToDoc doc words))))

(defn unlock
  "Unlock the index"
  ([^InvertedIndex this]
    (-> this (.unlock))))

(defn batch-size
  "For word vectors, this is the batch size for which to train on

  returns: the batch size for which to train on - `int`"
  (^Integer [^InvertedIndex this]
    (-> this (.batchSize))))

(defn each-doc-with-labels
  "Iterate over each document with a label

  func - the function to apply - `com.google.common.base.Function`
  exec - executor service for execution - `java.util.concurrent.Executor`"
  ([^InvertedIndex this ^com.google.common.base.Function func ^java.util.concurrent.Executor exec]
    (-> this (.eachDocWithLabels func exec))))

(defn document
  "Returns a list of words for a document

  index - `int`

  returns: `java.util.List<T>`"
  (^java.util.List [^InvertedIndex this ^Integer index]
    (-> this (.document index))))

(defn add-label-for-doc
  "Add word to a document

  doc - the document to add to - `int`
  word - the word to add - `T`"
  ([^InvertedIndex this ^Integer doc word]
    (-> this (.addLabelForDoc doc word))))

(defn finish
  "Finishes saving data"
  ([^InvertedIndex this]
    (-> this (.finish))))

(defn each-doc
  "Iterate over each document

  func - the function to apply - `com.google.common.base.Function`
  exec - executor service for execution - `java.util.concurrent.Executor`"
  ([^InvertedIndex this ^com.google.common.base.Function func ^java.util.concurrent.Executor exec]
    (-> this (.eachDoc func exec))))

(defn documents
  "Returns the list of documents a vocab word is in

  vocab-word - the vocab word to get documents for - `T`

  returns: the documents for a vocab word - `int[]`"
  ([^InvertedIndex this vocab-word]
    (-> this (.documents vocab-word))))

(defn batch-iter
  "Iterate over batches

  batch-size - `int`

  returns: the batch size - `java.util.Iterator<java.util.List<java.util.List<T>>>`"
  (^java.util.Iterator [^InvertedIndex this ^Integer batch-size]
    (-> this (.batchIter batch-size))))

(defn mini-batches
  "Iterates over mini batches

  returns: the mini batches created by this vectorizer - `java.util.Iterator<java.util.List<T>>`"
  (^java.util.Iterator [^InvertedIndex this]
    (-> this (.miniBatches))))

(defn add-words-to-doc-vocab-word
  "Adds words to the given document

  doc - the document to add to - `int`
  words - the words to add - `java.util.List`
  label - the label for the document - `java.util.Collection`"
  ([^InvertedIndex this ^Integer doc ^java.util.List words ^java.util.Collection label]
    (-> this (.addWordsToDocVocabWord doc words label))))

(defn total-words
  "Total number of words in the index

  returns: the total number of words in the index - `long`"
  (^Long [^InvertedIndex this]
    (-> this (.totalWords))))

(defn document-with-labels
  "Returns a list of words associated with the document
  and the associated labels

  index - `int`

  returns: `org.nd4j.linalg.primitives.Pair<java.util.List<T>,java.util.Collection<java.lang.String>>`"
  (^org.nd4j.linalg.primitives.Pair [^InvertedIndex this ^Integer index]
    (-> this (.documentWithLabels index))))

(defn docs
  "Iterate over documents

  returns: `java.util.Iterator<java.util.List<T>>`"
  (^java.util.Iterator [^InvertedIndex this]
    (-> this (.docs))))

(defn sample
  "Sampling for creating mini batches

  returns: the sampling for mini batches - `double`"
  (^Double [^InvertedIndex this]
    (-> this (.sample))))

