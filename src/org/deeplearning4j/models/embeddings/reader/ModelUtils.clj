(ns org.deeplearning4j.models.embeddings.reader.ModelUtils
  "Instances implementing this interface should be responsible for utility access to SequenceVectors model"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.reader ModelUtils]))

(defn init
  "This method implementations should accept given lookup table, and use them in further calls to interface methods

  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`"
  ([^ModelUtils this ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table]
    (-> this (.init lookup-table))))

(defn similarity
  "This method implementations should return distance between two given elements

  label-1 - `java.lang.String`
  label-2 - `java.lang.String`

  returns: `double`"
  (^Double [^ModelUtils this ^java.lang.String label-1 ^java.lang.String label-2]
    (-> this (.similarity label-1 label-2))))

(defn accuracy
  "Accuracy based on questions which are a space separated list of strings
  where the first word is the query word, the next 2 words are negative,
  and the last word is the predicted word to be nearest

  questions - the questions to ask - `java.util.List`

  returns: the accuracy based on these questions - `java.util.Map<java.lang.String,java.lang.Double>`"
  (^java.util.Map [^ModelUtils this ^java.util.List questions]
    (-> this (.accuracy questions))))

(defn similar-words-in-vocab-to
  "Find all words with a similar characters
  in the vocab

  word - the word to compare - `java.lang.String`
  accuracy - the accuracy: 0 to 1 - `double`

  returns: the list of words that are similar in the vocab - `java.util.List<java.lang.String>`"
  (^java.util.List [^ModelUtils this ^java.lang.String word ^Double accuracy]
    (-> this (.similarWordsInVocabTo word accuracy))))

(defn words-nearest
  "Words nearest based on positive and negative words

  positive - the positive words - `java.util.Collection`
  negative - the negative words - `java.util.Collection`
  top - the top n words - `int`

  returns: the words nearest the mean of the words - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^ModelUtils this ^java.util.Collection positive ^java.util.Collection negative ^Integer top]
    (-> this (.wordsNearest positive negative top)))
  (^java.util.Collection [^ModelUtils this ^java.lang.String label ^Integer n]
    (-> this (.wordsNearest label n))))

(defn words-nearest-sum
  "positive - `java.util.Collection`
  negative - `java.util.Collection`
  top - `int`

  returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^ModelUtils this ^java.util.Collection positive ^java.util.Collection negative ^Integer top]
    (-> this (.wordsNearestSum positive negative top)))
  (^java.util.Collection [^ModelUtils this ^java.lang.String word ^Integer n]
    (-> this (.wordsNearestSum word n))))

