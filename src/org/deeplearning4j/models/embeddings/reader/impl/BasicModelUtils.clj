(ns org.deeplearning4j.models.embeddings.reader.impl.BasicModelUtils
  "Basic implementation for ModelUtils interface, suited for standalone use.
 PLEASE NOTE: This reader applies normalization to underlying lookup table."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.reader.impl BasicModelUtils]))

(defn ->basic-model-utils
  "Constructor."
  (^BasicModelUtils []
    (new BasicModelUtils )))

(def *-exists
  "Static Constant.

  type: java.lang.String"
  BasicModelUtils/EXISTS)

(def *-correct
  "Static Constant.

  type: java.lang.String"
  BasicModelUtils/CORRECT)

(def *-wrong
  "Static Constant.

  type: java.lang.String"
  BasicModelUtils/WRONG)

(defn *get-labels
  "results - `java.util.List`
  limit - `int`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^java.util.List results ^Integer limit]
    (BasicModelUtils/getLabels results limit)))

(defn init
  "Description copied from interface: ModelUtils

  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`"
  ([^BasicModelUtils this ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table]
    (-> this (.init lookup-table))))

(defn similarity
  "Returns the similarity of 2 words. Result value will be in range [-1,1], where -1.0 is exact opposite similarity, i.e. NO similarity, and 1.0 is total match of two word vectors.
  However, most of time you'll see values in range [0,1], but that's something depends of training corpus.
  Returns NaN if any of labels not exists in vocab, or any label is null

  label-1 - the first word - `java.lang.String`
  label-2 - the second word - `java.lang.String`

  returns: a normalized similarity (cosine similarity) - `double`"
  (^Double [^BasicModelUtils this ^java.lang.String label-1 ^java.lang.String label-2]
    (-> this (.similarity label-1 label-2))))

(defn words-nearest
  "Description copied from interface: ModelUtils

  positive - the positive words - `java.util.Collection`
  negative - the negative words - `java.util.Collection`
  top - the top n words - `int`

  returns: the words nearest the mean of the words - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^BasicModelUtils this ^java.util.Collection positive ^java.util.Collection negative ^Integer top]
    (-> this (.wordsNearest positive negative top)))
  (^java.util.Collection [^BasicModelUtils this ^java.lang.String label ^Integer n]
    (-> this (.wordsNearest label n))))

(defn accuracy
  "Accuracy based on questions which are a space separated list of strings
  where the first word is the query word, the next 2 words are negative,
  and the last word is the predicted word to be nearest

  questions - the questions to ask - `java.util.List`

  returns: the accuracy based on these questions - `java.util.Map<java.lang.String,java.lang.Double>`"
  (^java.util.Map [^BasicModelUtils this ^java.util.List questions]
    (-> this (.accuracy questions))))

(defn similar-words-in-vocab-to
  "Find all words with a similar characters
  in the vocab

  word - the word to compare - `java.lang.String`
  accuracy - the accuracy: 0 to 1 - `double`

  returns: the list of words that are similar in the vocab - `java.util.List<java.lang.String>`"
  (^java.util.List [^BasicModelUtils this ^java.lang.String word ^Double accuracy]
    (-> this (.similarWordsInVocabTo word accuracy))))

(defn words-nearest-sum
  "Words nearest based on positive and negative words

  positive - the positive words - `java.util.Collection`
  negative - the negative words - `java.util.Collection`
  top - the top n words - `int`

  returns: the words nearest the mean of the words - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^BasicModelUtils this ^java.util.Collection positive ^java.util.Collection negative ^Integer top]
    (-> this (.wordsNearestSum positive negative top)))
  (^java.util.Collection [^BasicModelUtils this ^java.lang.String word ^Integer n]
    (-> this (.wordsNearestSum word n))))

