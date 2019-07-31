(ns com.atilika.kuromoji.viterbi.ViterbiNode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.viterbi ViterbiNode]))

(defn ->viterbi-node
  "Constructor.

  word-id - `int`
  surface - `java.lang.String`
  left-id - `int`
  right-id - `int`
  word-cost - `int`
  start-index - `int`
  type - `com.atilika.kuromoji.viterbi.ViterbiNode$Type`"
  (^ViterbiNode [^Integer word-id ^java.lang.String surface ^Integer left-id ^Integer right-id ^Integer word-cost ^Integer start-index ^com.atilika.kuromoji.viterbi.ViterbiNode$Type type]
    (new ViterbiNode word-id surface left-id right-id word-cost start-index type))
  (^ViterbiNode [^Integer word-id ^java.lang.String word ^com.atilika.kuromoji.dict.Dictionary dictionary ^Integer start-index ^com.atilika.kuromoji.viterbi.ViterbiNode$Type type]
    (new ViterbiNode word-id word dictionary start-index type)))

(defn set-path-cost
  "param cost minimum path cost found this far

  path-cost - cost to set for this node - `int`"
  ([^ViterbiNode this ^Integer path-cost]
    (-> this (.setPathCost path-cost))))

(defn get-type
  "returns: `com.atilika.kuromoji.viterbi.ViterbiNode$Type`"
  (^com.atilika.kuromoji.viterbi.ViterbiNode$Type [^ViterbiNode this]
    (-> this (.getType))))

(defn get-word-cost
  "returns: the cost - `int`"
  (^Integer [^ViterbiNode this]
    (-> this (.getWordCost))))

(defn get-start-index
  "returns: `int`"
  (^Integer [^ViterbiNode this]
    (-> this (.getStartIndex))))

(defn get-word-id
  "returns: the wordId - `int`"
  (^Integer [^ViterbiNode this]
    (-> this (.getWordId))))

(defn get-left-node
  "returns: `com.atilika.kuromoji.viterbi.ViterbiNode`"
  (^com.atilika.kuromoji.viterbi.ViterbiNode [^ViterbiNode this]
    (-> this (.getLeftNode))))

(defn get-path-cost
  "returns: the cost - `int`"
  (^Integer [^ViterbiNode this]
    (-> this (.getPathCost))))

(defn get-surface
  "returns: the surface - `java.lang.String`"
  (^java.lang.String [^ViterbiNode this]
    (-> this (.getSurface))))

(defn get-left-id
  "returns: the leftId - `int`"
  (^Integer [^ViterbiNode this]
    (-> this (.getLeftId))))

(defn get-right-id
  "returns: the rightId - `int`"
  (^Integer [^ViterbiNode this]
    (-> this (.getRightId))))

(defn set-left-node
  "node - `com.atilika.kuromoji.viterbi.ViterbiNode`"
  ([^ViterbiNode this ^com.atilika.kuromoji.viterbi.ViterbiNode node]
    (-> this (.setLeftNode node))))

