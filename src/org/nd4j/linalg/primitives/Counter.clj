(ns org.nd4j.linalg.primitives.Counter
  "Simple counter implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.primitives Counter]))

(defn ->counter
  "Constructor."
  (^Counter []
    (new Counter )))

(defn get-count
  "element - `T`

  returns: `double`"
  (^Double [^Counter this element]
    (-> this (.getCount element))))

(defn total-count
  "This method returns total sum of counter values

  returns: `double`"
  (^Double [^Counter this]
    (-> this (.totalCount))))

(defn normalize
  "This method will apply normalization to counter values and totals."
  ([^Counter this]
    (-> this (.normalize))))

(defn increment-count
  "element - `T`
  inc - `double`"
  ([^Counter this element ^Double inc]
    (-> this (.incrementCount element inc))))

(defn drop-elements-below-threshold
  "This method will remove all elements with counts below given threshold from counter

  threshold - `double`"
  ([^Counter this ^Double threshold]
    (-> this (.dropElementsBelowThreshold threshold))))

(defn entry-set
  "This method returns Set of this counter

  returns: `java.util.Set<java.util.Map.Entry<T,org.nd4j.linalg.primitives.AtomicDouble>>`"
  (^java.util.Set [^Counter this]
    (-> this (.entrySet))))

(defn set-count
  "This method sets new counter value for given element

  element - element to be updated - `T`
  count - new counter value - `double`

  returns: previous value - `double`"
  (^Double [^Counter this element ^Double count]
    (-> this (.setCount element count))))

(defn remove-key
  "This method removes given key from counter

  element - `T`

  returns: counter value - `double`"
  (^Double [^Counter this element]
    (-> this (.removeKey element))))

(defn keep-top-n-elements
  "This method removes all elements except of top N by counter values

  n - `int`"
  ([^Counter this ^Integer n]
    (-> this (.keepTopNElements n))))

(defn key-set
  "This method returns Set of elements used in this counter

  returns: `java.util.Set<T>`"
  (^java.util.Set [^Counter this]
    (-> this (.keySet))))

(defn get-probability
  "This method returns probability of given element

  element - `T`

  returns: `double`"
  (^Double [^Counter this element]
    (-> this (.getProbability element))))

(defn as-reversed-priority-queue
  "returns: `java.util.PriorityQueue<org.nd4j.linalg.primitives.Pair<T,java.lang.Double>>`"
  (^java.util.PriorityQueue [^Counter this]
    (-> this (.asReversedPriorityQueue))))

(defn key-set-sorted
  "This method returns List of elements, sorted by their counts

  returns: `java.util.List<T>`"
  (^java.util.List [^Counter this]
    (-> this (.keySetSorted))))

(defn arg-max
  "This method returns element with highest counter value

  returns: `T`"
  ([^Counter this]
    (-> this (.argMax))))

(defn as-priority-queue
  "returns: `java.util.PriorityQueue<org.nd4j.linalg.primitives.Pair<T,java.lang.Double>>`"
  (^java.util.PriorityQueue [^Counter this]
    (-> this (.asPriorityQueue))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Counter this]
    (-> this (.hashCode))))

(defn increment-all
  "This method will increment all elements in collection

  elements - `java.util.Collection`
  inc - `double`"
  ([^Counter this ^java.util.Collection elements ^Double inc]
    (-> this (.incrementAll elements inc)))
  ([^Counter this ^org.nd4j.linalg.primitives.Counter other]
    (-> this (.incrementAll other))))

(defn empty?
  "This method returns TRUE if counter has no elements, FALSE otherwise

  returns: `boolean`"
  (^Boolean [^Counter this]
    (-> this (.isEmpty))))

(defn size
  "Returns total number of tracked elements

  returns: `int`"
  (^Integer [^Counter this]
    (-> this (.size))))

(defn clear
  "This method effectively resets counter to empty state"
  ([^Counter this]
    (-> this (.clear))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Counter this ^java.lang.Object o]
    (-> this (.equals o))))

(defn contains-element
  "This method checks, if element exist in this counter

  element - `T`

  returns: `boolean`"
  (^Boolean [^Counter this element]
    (-> this (.containsElement element))))

