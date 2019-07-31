(ns org.datavec.nlp.movingwindow.Window
  "A representation of a sliding window.
 This is used for creating training examples."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.movingwindow Window]))

(defn ->window
  "Constructor.

  Initialize a window with the given size

  words - the words to use - `java.util.Collection`
  window-size - the size of the window - `int`
  begin - the begin index for the window - `int`
  end - the end index for the window - `int`"
  (^Window [^java.util.Collection words ^Integer window-size ^Integer begin ^Integer end]
    (new Window words window-size begin end))
  (^Window [^java.util.Collection words ^Integer begin ^Integer end]
    (new Window words begin end)))

(defn get-focus-word
  "returns: `java.lang.String`"
  (^java.lang.String [^Window this]
    (-> this (.getFocusWord))))

(defn begin-label?
  "returns: `boolean`"
  (^Boolean [^Window this]
    (-> this (.isBeginLabel))))

(defn get-begin
  "returns: `int`"
  (^Integer [^Window this]
    (-> this (.getBegin))))

(defn get-window-size
  "returns: `int`"
  (^Integer [^Window this]
    (-> this (.getWindowSize))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Window this]
    (-> this (.toString))))

(defn get-median
  "returns: `int`"
  (^Integer [^Window this]
    (-> this (.getMedian))))

(defn set-begin
  "begin - `int`"
  ([^Window this ^Integer begin]
    (-> this (.setBegin begin))))

(defn end-label?
  "returns: `boolean`"
  (^Boolean [^Window this]
    (-> this (.isEndLabel))))

(defn get-end
  "returns: `int`"
  (^Integer [^Window this]
    (-> this (.getEnd))))

(defn set-end
  "end - `int`"
  ([^Window this ^Integer end]
    (-> this (.setEnd end))))

(defn get-label
  "returns: `java.lang.String`"
  (^java.lang.String [^Window this]
    (-> this (.getLabel))))

(defn set-words
  "words - `java.util.List`"
  ([^Window this ^java.util.List words]
    (-> this (.setWords words))))

(defn get-words
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Window this]
    (-> this (.getWords))))

(defn as-tokens
  "returns: `java.lang.String`"
  (^java.lang.String [^Window this]
    (-> this (.asTokens))))

(defn get-word
  "i - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Window this ^Integer i]
    (-> this (.getWord i))))

(defn set-label
  "label - `java.lang.String`"
  ([^Window this ^java.lang.String label]
    (-> this (.setLabel label))))

