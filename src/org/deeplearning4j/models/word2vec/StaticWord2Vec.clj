(ns org.deeplearning4j.models.word2vec.StaticWord2Vec
  "This is special limited Word2Vec implementation, suited for serving as lookup table in concurrent multi-gpu environment
 This implementation DOES NOT load all vectors onto any of gpus, instead of that it holds vectors in, optionally, compressed state in host memory.
 This implementation DOES NOT provide some of original Word2Vec methods, such as wordsNearest or wordsNearestSum."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec StaticWord2Vec]))

(defn get-word-vector
  "Get the word vector for a given matrix

  word - the word to get the matrix for - `java.lang.String`

  returns: the ndarray for this word - `double[]`"
  ([^StaticWord2Vec this ^java.lang.String word]
    (-> this (.getWordVector word))))

(defn lookup-table
  "Lookup table for the vectors
  PLEASE NOTE: This method is not available in this implementation.

  returns: `org.deeplearning4j.models.embeddings.WeightLookupTable`"
  (^org.deeplearning4j.models.embeddings.WeightLookupTable [^StaticWord2Vec this]
    (-> this (.lookupTable))))

(defn get-word-vectors-mean
  "This method returns mean vector, built from words/labels passed in

  labels - `java.util.Collection`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^StaticWord2Vec this ^java.util.Collection labels]
    (-> this (.getWordVectorsMean labels))))

(defn words-nearest-sum
  "Words nearest based on positive and negative words
  PLEASE NOTE: This method is not available in this implementation.

  positive - the positive words - `java.util.Collection`
  negative - the negative words - `java.util.Collection`
  top - the top n words - `int`

  returns: the words nearest the mean of the words - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^StaticWord2Vec this ^java.util.Collection positive ^java.util.Collection negative ^Integer top]
    (-> this (.wordsNearestSum positive negative top)))
  (^java.util.Collection [^StaticWord2Vec this ^java.lang.String word ^Integer n]
    (-> this (.wordsNearestSum word n))))

(defn has-word?
  "Returns true if the model has this word in the vocab

  word - the word to test for - `java.lang.String`

  returns: true if the model has the word in the vocab - `boolean`"
  (^Boolean [^StaticWord2Vec this ^java.lang.String word]
    (-> this (.hasWord word))))

(defn similarity
  "Returns the similarity of 2 words

  label-1 - the first word - `java.lang.String`
  label-2 - the second word - `java.lang.String`

  returns: a normalized similarity (cosine similarity) - `double`"
  (^Double [^StaticWord2Vec this ^java.lang.String label-1 ^java.lang.String label-2]
    (-> this (.similarity label-1 label-2))))

(defn vocab
  "Vocab for the vectors

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabCache`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabCache [^StaticWord2Vec this]
    (-> this (.vocab))))

(defn get-word-vector-matrix-normalized
  "Returns the word vector divided by the norm2 of the array

  word - the word to get the matrix for - `java.lang.String`

  returns: the looked up matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^StaticWord2Vec this ^java.lang.String word]
    (-> this (.getWordVectorMatrixNormalized word))))

(defn get-unk
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticWord2Vec this]
    (-> this (.getUNK))))

(defn set-model-utils
  "Specifies ModelUtils to be used to access model
  PLEASE NOTE: This method has no effect in this implementation.

  utils - `org.deeplearning4j.models.embeddings.reader.ModelUtils`"
  ([^StaticWord2Vec this ^org.deeplearning4j.models.embeddings.reader.ModelUtils utils]
    (-> this (.setModelUtils utils))))

(defn similar-words-in-vocab-to
  "Find all words with a similar characters
  in the vocab
  PLEASE NOTE: This method is not available in this implementation.

  word - the word to compare - `java.lang.String`
  accuracy - the accuracy: 0 to 1 - `double`

  returns: the list of words that are similar in the vocab - `java.util.List<java.lang.String>`"
  (^java.util.List [^StaticWord2Vec this ^java.lang.String word ^Double accuracy]
    (-> this (.similarWordsInVocabTo word accuracy))))

(defn set-unk
  "new-unk - `java.lang.String`"
  ([^StaticWord2Vec this ^java.lang.String new-unk]
    (-> this (.setUNK new-unk))))

(defn get-word-vectors
  "This method returns 2D array, where each row represents corresponding word/label

  labels - `java.util.Collection`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^StaticWord2Vec this ^java.util.Collection labels]
    (-> this (.getWordVectors labels))))

(defn get-word-vector-matrix
  "Get the word vector for a given matrix

  word - the word to get the matrix for - `java.lang.String`

  returns: the ndarray for this word - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^StaticWord2Vec this ^java.lang.String word]
    (-> this (.getWordVectorMatrix word))))

(defn index-of
  "word - `java.lang.String`

  returns: `int`"
  (^Integer [^StaticWord2Vec this ^java.lang.String word]
    (-> this (.indexOf word))))

(defn accuracy
  "Accuracy based on questions which are a space separated list of strings
  where the first word is the query word, the next 2 words are negative,
  and the last word is the predicted word to be nearest
  PLEASE NOTE: This method is not available in this implementation.

  questions - the questions to ask - `java.util.List`

  returns: the accuracy based on these questions - `java.util.Map<java.lang.String,java.lang.Double>`"
  (^java.util.Map [^StaticWord2Vec this ^java.util.List questions]
    (-> this (.accuracy questions))))

(defn words-nearest
  "Words nearest based on positive and negative words
  PLEASE NOTE: This method is not available in this implementation.

  positive - the positive words - `java.util.Collection`
  negative - the negative words - `java.util.Collection`
  top - the top n words - `int`

  returns: the words nearest the mean of the words - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^StaticWord2Vec this ^java.util.Collection positive ^java.util.Collection negative ^Integer top]
    (-> this (.wordsNearest positive negative top)))
  (^java.util.Collection [^StaticWord2Vec this ^java.lang.String word ^Integer n]
    (-> this (.wordsNearest word n))))

