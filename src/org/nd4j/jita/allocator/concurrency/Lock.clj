(ns org.nd4j.jita.allocator.concurrency.Lock
  "Collection of multilevel locks for JITA"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.concurrency Lock]))

(defn object-read-unlock
  "This method releases object-level read lock, and global-level read lock

  object - `java.lang.Object`"
  ([^Lock this ^java.lang.Object object]
    (-> this (.objectReadUnlock object))))

(defn externals-read-unlock
  "This methods releases read-lock on externals, and read-lock on global"
  ([^Lock this]
    (-> this (.externalsReadUnlock))))

(defn shape-read-lock
  "This method acquires shape-level read lock, and read locks for object and global

  object - `java.lang.Object`
  shape - `org.nd4j.jita.allocator.impl.AllocationShape`"
  ([^Lock this ^java.lang.Object object ^org.nd4j.jita.allocator.impl.AllocationShape shape]
    (-> this (.shapeReadLock object shape))))

(defn detach-object
  "This method notifies locker that specific object was removed from tracking list

  object - `java.lang.Object`"
  ([^Lock this ^java.lang.Object object]
    (-> this (.detachObject object))))

(defn shape-write-lock
  "This method acquires shape-level write lock, and read locks for object and global

  object - `java.lang.Object`
  shape - `org.nd4j.jita.allocator.impl.AllocationShape`"
  ([^Lock this ^java.lang.Object object ^org.nd4j.jita.allocator.impl.AllocationShape shape]
    (-> this (.shapeWriteLock object shape))))

(defn global-read-lock
  "This method acquires global-level read lock"
  ([^Lock this]
    (-> this (.globalReadLock))))

(defn attach-object
  "This method notifies locker, that specific object was added to tracking list

  object - `java.lang.Object`"
  ([^Lock this ^java.lang.Object object]
    (-> this (.attachObject object))))

(defn global-read-unlock
  "This method releases global-level read lock"
  ([^Lock this]
    (-> this (.globalReadUnlock))))

(defn object-write-lock
  "This method acquires object-level write lock, and global-level read lock

  object - `java.lang.Object`"
  ([^Lock this ^java.lang.Object object]
    (-> this (.objectWriteLock object))))

(defn externals-read-lock
  "This methods acquires read-lock on externals, and read-lock on global"
  ([^Lock this]
    (-> this (.externalsReadLock))))

(defn object-write-unlock
  "This method releases object-level read lock, and global-level read lock

  object - `java.lang.Object`"
  ([^Lock this ^java.lang.Object object]
    (-> this (.objectWriteUnlock object))))

(defn object-read-lock
  "This method acquires object-level read lock, and global-level read lock

  object - `java.lang.Object`"
  ([^Lock this ^java.lang.Object object]
    (-> this (.objectReadLock object))))

(defn shape-read-unlock
  "This method releases shape-level read lock, and read locks for object and global

  object - `java.lang.Object`
  shape - `org.nd4j.jita.allocator.impl.AllocationShape`"
  ([^Lock this ^java.lang.Object object ^org.nd4j.jita.allocator.impl.AllocationShape shape]
    (-> this (.shapeReadUnlock object shape))))

(defn shape-write-unlock
  "This method releases shape-level write lock, and read locks for object and global

  object - `java.lang.Object`
  shape - `org.nd4j.jita.allocator.impl.AllocationShape`"
  ([^Lock this ^java.lang.Object object ^org.nd4j.jita.allocator.impl.AllocationShape shape]
    (-> this (.shapeWriteUnlock object shape))))

(defn externals-write-unlock
  "This methods releases write-lock on externals, and read-lock on global"
  ([^Lock this]
    (-> this (.externalsWriteUnlock))))

(defn externals-write-lock
  "This methods acquires write-lock on externals, and read-lock on global"
  ([^Lock this]
    (-> this (.externalsWriteLock))))

(defn global-write-unlock
  "This method releases global-level write lock"
  ([^Lock this]
    (-> this (.globalWriteUnlock))))

(defn global-write-lock
  "This method acquires global-level write lock"
  ([^Lock this]
    (-> this (.globalWriteLock))))

