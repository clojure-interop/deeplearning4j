(ns org.nd4j.parameterserver.model.SubscriberState
  "Reflects the state of
 a parameter server"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.model SubscriberState]))

(defn ->subscriber-state
  "Constructor."
  (^SubscriberState []
    (new SubscriberState )))

(defn *empty
  "Returns an empty subscriber state
  with -1 as total updates, master as false
  and server state as empty

  returns: an empty subscriber state - `org.nd4j.parameterserver.model.SubscriberState`"
  (^org.nd4j.parameterserver.model.SubscriberState []
    (SubscriberState/empty )))

(defn *read
  "Read the subscriber state to the given DataInput
  in the order of:
  isMaster
  serverState
  totalUpdates
  streamId

  data-input - the data output to write to - `java.io.DataInput`

  returns: `org.nd4j.parameterserver.model.SubscriberState`

  throws: java.io.IOException"
  (^org.nd4j.parameterserver.model.SubscriberState [^java.io.DataInput data-input]
    (SubscriberState/read data-input)))

(defn write
  "Write the subscriber state to the given DataInput
  in the order of:
  isMaster
  serverState
  totalUpdates
  streamId

  data-output - the data output to write to - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^SubscriberState this ^java.io.DataOutput data-output]
    (-> this (.write data-output))))

(defn server-type
  "Return the server opType (master or slave)

  returns: the server opType - `java.lang.String`"
  (^java.lang.String [^SubscriberState this]
    (-> this (.serverType))))

(defn compare-to
  "Compares this object with the specified object for order. Returns a
  negative integer, zero, or a positive integer as this object is less
  than, equal to, or greater than the specified object.

  The implementor must ensure sgn(x.compareTo(y)) ==
  -sgn(y.compareTo(x)) for all x and y. (This
  implies that x.compareTo(y) must throw an exception iff
  y.compareTo(x) throws an exception.)

  The implementor must also ensure that the relation is transitive:
  (x.compareTo(y)>0 && y.compareTo(z)>0) implies
  x.compareTo(z)>0.

  Finally, the implementor must ensure that x.compareTo(y)==0
  implies that sgn(x.compareTo(z)) == sgn(y.compareTo(z)), for
  all z.

  It is strongly recommended, but not strictly required that
  (x.compareTo(y)==0) == (x.equals(y)). Generally speaking, any
  class that implements the Comparable interface and violates
  this condition should clearly indicate this fact. The recommended
  language is \"Note: this class has a natural ordering that is
  inconsistent with equals.\"

  In the foregoing description, the notation
  sgn(expression) designates the mathematical
  signum function, which is defined to return one of -1,
  0, or 1 according to whether the value of
  expression is negative, zero or positive.

  o - the object to be compared. - `org.nd4j.parameterserver.model.SubscriberState`

  returns: a negative integer, zero, or a positive integer as this object
  is less than, equal to, or greater than the specified object. - `int`

  throws: java.lang.NullPointerException - if the specified object is null"
  (^Integer [^SubscriberState this ^org.nd4j.parameterserver.model.SubscriberState o]
    (-> this (.compareTo o))))

