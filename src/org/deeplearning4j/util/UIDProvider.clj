(ns org.deeplearning4j.util.UIDProvider
  "Static methods for obtaining unique identifiers for both the machine (hardware) and the JVM.
 Note: the unique hardware identifier does NOT provide any strong guarantees of uniqueness of the returned identifier
 with respect to machine restarts and hardware changes, and should not be relied upon for anything where guarantees
 are required.
 Note also that as a fallback, if no hardware UID can be determined, the JVM UID will be returned as the hardware UID also."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util UIDProvider]))

(defn *get-jvmuid
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UIDProvider/getJVMUID )))

(defn *get-hardware-uid
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UIDProvider/getHardwareUID )))

