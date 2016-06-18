/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btManifoldPoint extends BulletBase {
	private long swigCPtr;
	
	protected btManifoldPoint(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btManifoldPoint, normally you should not need this constructor it's intended for low-level usage. */ 
	public btManifoldPoint(long cPtr, boolean cMemoryOwn) {
		this("btManifoldPoint", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btManifoldPoint obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btManifoldPoint(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	private final static btManifoldPoint temp = new btManifoldPoint(0, false);
	/** Obtains a temporary instance, used by native methods that return a btManifoldPoint instance */
	protected static btManifoldPoint obtainTemp(long cPtr, boolean own) {
		temp.reset(cPtr, own);
		return temp;
	}
	
	private static btManifoldPoint[] argumentInstances = new btManifoldPoint[] {new btManifoldPoint(0, false),
		new btManifoldPoint(0, false), new btManifoldPoint(0, false), new btManifoldPoint(0, false)};
	private static int argumentIndex = -1;
	/** Obtains a temporary instance, used for callback methods with one or more btManifoldPoint arguments */
	protected static btManifoldPoint obtainForArgument(final long swigCPtr, boolean owner) {
		btManifoldPoint instance = argumentInstances[argumentIndex = (argumentIndex + 1) & 3];
		instance.reset(swigCPtr, owner);
		return instance;
	}

  public btManifoldPoint() {
    this(CollisionJNI.new_btManifoldPoint__SWIG_0(), true);
  }

  public btManifoldPoint(Vector3 pointA, Vector3 pointB, Vector3 normal, float distance) {
    this(CollisionJNI.new_btManifoldPoint__SWIG_1(pointA, pointB, normal, distance), true);
  }

  public void setDistance1(float value) {
    CollisionJNI.btManifoldPoint_distance1_set(swigCPtr, this, value);
  }

  public float getDistance1() {
    return CollisionJNI.btManifoldPoint_distance1_get(swigCPtr, this);
  }

  public void setCombinedFriction(float value) {
    CollisionJNI.btManifoldPoint_combinedFriction_set(swigCPtr, this, value);
  }

  public float getCombinedFriction() {
    return CollisionJNI.btManifoldPoint_combinedFriction_get(swigCPtr, this);
  }

  public void setCombinedRollingFriction(float value) {
    CollisionJNI.btManifoldPoint_combinedRollingFriction_set(swigCPtr, this, value);
  }

  public float getCombinedRollingFriction() {
    return CollisionJNI.btManifoldPoint_combinedRollingFriction_get(swigCPtr, this);
  }

  public void setCombinedRestitution(float value) {
    CollisionJNI.btManifoldPoint_combinedRestitution_set(swigCPtr, this, value);
  }

  public float getCombinedRestitution() {
    return CollisionJNI.btManifoldPoint_combinedRestitution_get(swigCPtr, this);
  }

  public void setPartId0(int value) {
    CollisionJNI.btManifoldPoint_partId0_set(swigCPtr, this, value);
  }

  public int getPartId0() {
    return CollisionJNI.btManifoldPoint_partId0_get(swigCPtr, this);
  }

  public void setPartId1(int value) {
    CollisionJNI.btManifoldPoint_partId1_set(swigCPtr, this, value);
  }

  public int getPartId1() {
    return CollisionJNI.btManifoldPoint_partId1_get(swigCPtr, this);
  }

  public void setIndex0(int value) {
    CollisionJNI.btManifoldPoint_index0_set(swigCPtr, this, value);
  }

  public int getIndex0() {
    return CollisionJNI.btManifoldPoint_index0_get(swigCPtr, this);
  }

  public void setIndex1(int value) {
    CollisionJNI.btManifoldPoint_index1_set(swigCPtr, this, value);
  }

  public int getIndex1() {
    return CollisionJNI.btManifoldPoint_index1_get(swigCPtr, this);
  }

  public void setUserPersistentData(long value) {
    CollisionJNI.btManifoldPoint_userPersistentData_set(swigCPtr, this, value);
  }

  public long getUserPersistentData() {
    return CollisionJNI.btManifoldPoint_userPersistentData_get(swigCPtr, this);
  }

  public void setLateralFrictionInitialized(boolean value) {
    CollisionJNI.btManifoldPoint_lateralFrictionInitialized_set(swigCPtr, this, value);
  }

  public boolean getLateralFrictionInitialized() {
    return CollisionJNI.btManifoldPoint_lateralFrictionInitialized_get(swigCPtr, this);
  }

  public void setAppliedImpulse(float value) {
    CollisionJNI.btManifoldPoint_appliedImpulse_set(swigCPtr, this, value);
  }

  public float getAppliedImpulse() {
    return CollisionJNI.btManifoldPoint_appliedImpulse_get(swigCPtr, this);
  }

  public void setAppliedImpulseLateral1(float value) {
    CollisionJNI.btManifoldPoint_appliedImpulseLateral1_set(swigCPtr, this, value);
  }

  public float getAppliedImpulseLateral1() {
    return CollisionJNI.btManifoldPoint_appliedImpulseLateral1_get(swigCPtr, this);
  }

  public void setAppliedImpulseLateral2(float value) {
    CollisionJNI.btManifoldPoint_appliedImpulseLateral2_set(swigCPtr, this, value);
  }

  public float getAppliedImpulseLateral2() {
    return CollisionJNI.btManifoldPoint_appliedImpulseLateral2_get(swigCPtr, this);
  }

  public void setContactMotion1(float value) {
    CollisionJNI.btManifoldPoint_contactMotion1_set(swigCPtr, this, value);
  }

  public float getContactMotion1() {
    return CollisionJNI.btManifoldPoint_contactMotion1_get(swigCPtr, this);
  }

  public void setContactMotion2(float value) {
    CollisionJNI.btManifoldPoint_contactMotion2_set(swigCPtr, this, value);
  }

  public float getContactMotion2() {
    return CollisionJNI.btManifoldPoint_contactMotion2_get(swigCPtr, this);
  }

  public void setContactCFM1(float value) {
    CollisionJNI.btManifoldPoint_contactCFM1_set(swigCPtr, this, value);
  }

  public float getContactCFM1() {
    return CollisionJNI.btManifoldPoint_contactCFM1_get(swigCPtr, this);
  }

  public void setContactCFM2(float value) {
    CollisionJNI.btManifoldPoint_contactCFM2_set(swigCPtr, this, value);
  }

  public float getContactCFM2() {
    return CollisionJNI.btManifoldPoint_contactCFM2_get(swigCPtr, this);
  }

  public void setLifeTime(int value) {
    CollisionJNI.btManifoldPoint_lifeTime_set(swigCPtr, this, value);
  }

  public int getLifeTime() {
    return CollisionJNI.btManifoldPoint_lifeTime_get(swigCPtr, this);
  }

  public float getDistance() {
    return CollisionJNI.btManifoldPoint_getDistance(swigCPtr, this);
  }

  public void setDistance(float dist) {
    CollisionJNI.btManifoldPoint_setDistance(swigCPtr, this, dist);
  }

  public int getUserValue() {
    return CollisionJNI.btManifoldPoint_getUserValue(swigCPtr, this);
  }

  public void setUserValue(int value) {
    CollisionJNI.btManifoldPoint_setUserValue(swigCPtr, this, value);
  }

  public void getLocalPointA(Vector3 out) {
    CollisionJNI.btManifoldPoint_getLocalPointA(swigCPtr, this, out);
  }

  public void setLocalPointA(Vector3 value) {
    CollisionJNI.btManifoldPoint_setLocalPointA(swigCPtr, this, value);
  }

  public void getLocalPointB(Vector3 out) {
    CollisionJNI.btManifoldPoint_getLocalPointB(swigCPtr, this, out);
  }

  public void setLocalPointB(Vector3 value) {
    CollisionJNI.btManifoldPoint_setLocalPointB(swigCPtr, this, value);
  }

  public void getPositionWorldOnA(Vector3 out) {
    CollisionJNI.btManifoldPoint_getPositionWorldOnA(swigCPtr, this, out);
  }

  public void setPositionWorldOnA(Vector3 value) {
    CollisionJNI.btManifoldPoint_setPositionWorldOnA(swigCPtr, this, value);
  }

  public void getPositionWorldOnB(Vector3 out) {
    CollisionJNI.btManifoldPoint_getPositionWorldOnB(swigCPtr, this, out);
  }

  public void setPositionWorldOnB(Vector3 value) {
    CollisionJNI.btManifoldPoint_setPositionWorldOnB(swigCPtr, this, value);
  }

  public void getNormalWorldOnB(Vector3 out) {
    CollisionJNI.btManifoldPoint_getNormalWorldOnB(swigCPtr, this, out);
  }

  public void setNormalWorldOnB(Vector3 value) {
    CollisionJNI.btManifoldPoint_setNormalWorldOnB(swigCPtr, this, value);
  }

  public void getLateralFrictionDir1(Vector3 out) {
    CollisionJNI.btManifoldPoint_getLateralFrictionDir1(swigCPtr, this, out);
  }

  public void setLateralFrictionDir1(Vector3 value) {
    CollisionJNI.btManifoldPoint_setLateralFrictionDir1(swigCPtr, this, value);
  }

  public void getLateralFrictionDir2(Vector3 out) {
    CollisionJNI.btManifoldPoint_getLateralFrictionDir2(swigCPtr, this, out);
  }

  public void setLateralFrictionDir2(Vector3 value) {
    CollisionJNI.btManifoldPoint_setLateralFrictionDir2(swigCPtr, this, value);
  }

}
