/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class SoftBodyConfigData extends BulletBase {
	private long swigCPtr;
	
	protected SoftBodyConfigData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new SoftBodyConfigData, normally you should not need this constructor it's intended for low-level usage. */ 
	public SoftBodyConfigData(long cPtr, boolean cMemoryOwn) {
		this("SoftBodyConfigData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(SoftBodyConfigData obj) {
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
				SoftbodyJNI.delete_SoftBodyConfigData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setAeroModel(int value) {
    SoftbodyJNI.SoftBodyConfigData_aeroModel_set(swigCPtr, this, value);
  }

  public int getAeroModel() {
    return SoftbodyJNI.SoftBodyConfigData_aeroModel_get(swigCPtr, this);
  }

  public void setBaumgarte(float value) {
    SoftbodyJNI.SoftBodyConfigData_baumgarte_set(swigCPtr, this, value);
  }

  public float getBaumgarte() {
    return SoftbodyJNI.SoftBodyConfigData_baumgarte_get(swigCPtr, this);
  }

  public void setDamping(float value) {
    SoftbodyJNI.SoftBodyConfigData_damping_set(swigCPtr, this, value);
  }

  public float getDamping() {
    return SoftbodyJNI.SoftBodyConfigData_damping_get(swigCPtr, this);
  }

  public void setDrag(float value) {
    SoftbodyJNI.SoftBodyConfigData_drag_set(swigCPtr, this, value);
  }

  public float getDrag() {
    return SoftbodyJNI.SoftBodyConfigData_drag_get(swigCPtr, this);
  }

  public void setLift(float value) {
    SoftbodyJNI.SoftBodyConfigData_lift_set(swigCPtr, this, value);
  }

  public float getLift() {
    return SoftbodyJNI.SoftBodyConfigData_lift_get(swigCPtr, this);
  }

  public void setPressure(float value) {
    SoftbodyJNI.SoftBodyConfigData_pressure_set(swigCPtr, this, value);
  }

  public float getPressure() {
    return SoftbodyJNI.SoftBodyConfigData_pressure_get(swigCPtr, this);
  }

  public void setVolume(float value) {
    SoftbodyJNI.SoftBodyConfigData_volume_set(swigCPtr, this, value);
  }

  public float getVolume() {
    return SoftbodyJNI.SoftBodyConfigData_volume_get(swigCPtr, this);
  }

  public void setDynamicFriction(float value) {
    SoftbodyJNI.SoftBodyConfigData_dynamicFriction_set(swigCPtr, this, value);
  }

  public float getDynamicFriction() {
    return SoftbodyJNI.SoftBodyConfigData_dynamicFriction_get(swigCPtr, this);
  }

  public void setPoseMatch(float value) {
    SoftbodyJNI.SoftBodyConfigData_poseMatch_set(swigCPtr, this, value);
  }

  public float getPoseMatch() {
    return SoftbodyJNI.SoftBodyConfigData_poseMatch_get(swigCPtr, this);
  }

  public void setRigidContactHardness(float value) {
    SoftbodyJNI.SoftBodyConfigData_rigidContactHardness_set(swigCPtr, this, value);
  }

  public float getRigidContactHardness() {
    return SoftbodyJNI.SoftBodyConfigData_rigidContactHardness_get(swigCPtr, this);
  }

  public void setKineticContactHardness(float value) {
    SoftbodyJNI.SoftBodyConfigData_kineticContactHardness_set(swigCPtr, this, value);
  }

  public float getKineticContactHardness() {
    return SoftbodyJNI.SoftBodyConfigData_kineticContactHardness_get(swigCPtr, this);
  }

  public void setSoftContactHardness(float value) {
    SoftbodyJNI.SoftBodyConfigData_softContactHardness_set(swigCPtr, this, value);
  }

  public float getSoftContactHardness() {
    return SoftbodyJNI.SoftBodyConfigData_softContactHardness_get(swigCPtr, this);
  }

  public void setAnchorHardness(float value) {
    SoftbodyJNI.SoftBodyConfigData_anchorHardness_set(swigCPtr, this, value);
  }

  public float getAnchorHardness() {
    return SoftbodyJNI.SoftBodyConfigData_anchorHardness_get(swigCPtr, this);
  }

  public void setSoftRigidClusterHardness(float value) {
    SoftbodyJNI.SoftBodyConfigData_softRigidClusterHardness_set(swigCPtr, this, value);
  }

  public float getSoftRigidClusterHardness() {
    return SoftbodyJNI.SoftBodyConfigData_softRigidClusterHardness_get(swigCPtr, this);
  }

  public void setSoftKineticClusterHardness(float value) {
    SoftbodyJNI.SoftBodyConfigData_softKineticClusterHardness_set(swigCPtr, this, value);
  }

  public float getSoftKineticClusterHardness() {
    return SoftbodyJNI.SoftBodyConfigData_softKineticClusterHardness_get(swigCPtr, this);
  }

  public void setSoftSoftClusterHardness(float value) {
    SoftbodyJNI.SoftBodyConfigData_softSoftClusterHardness_set(swigCPtr, this, value);
  }

  public float getSoftSoftClusterHardness() {
    return SoftbodyJNI.SoftBodyConfigData_softSoftClusterHardness_get(swigCPtr, this);
  }

  public void setSoftRigidClusterImpulseSplit(float value) {
    SoftbodyJNI.SoftBodyConfigData_softRigidClusterImpulseSplit_set(swigCPtr, this, value);
  }

  public float getSoftRigidClusterImpulseSplit() {
    return SoftbodyJNI.SoftBodyConfigData_softRigidClusterImpulseSplit_get(swigCPtr, this);
  }

  public void setSoftKineticClusterImpulseSplit(float value) {
    SoftbodyJNI.SoftBodyConfigData_softKineticClusterImpulseSplit_set(swigCPtr, this, value);
  }

  public float getSoftKineticClusterImpulseSplit() {
    return SoftbodyJNI.SoftBodyConfigData_softKineticClusterImpulseSplit_get(swigCPtr, this);
  }

  public void setSoftSoftClusterImpulseSplit(float value) {
    SoftbodyJNI.SoftBodyConfigData_softSoftClusterImpulseSplit_set(swigCPtr, this, value);
  }

  public float getSoftSoftClusterImpulseSplit() {
    return SoftbodyJNI.SoftBodyConfigData_softSoftClusterImpulseSplit_get(swigCPtr, this);
  }

  public void setMaxVolume(float value) {
    SoftbodyJNI.SoftBodyConfigData_maxVolume_set(swigCPtr, this, value);
  }

  public float getMaxVolume() {
    return SoftbodyJNI.SoftBodyConfigData_maxVolume_get(swigCPtr, this);
  }

  public void setTimeScale(float value) {
    SoftbodyJNI.SoftBodyConfigData_timeScale_set(swigCPtr, this, value);
  }

  public float getTimeScale() {
    return SoftbodyJNI.SoftBodyConfigData_timeScale_get(swigCPtr, this);
  }

  public void setVelocityIterations(int value) {
    SoftbodyJNI.SoftBodyConfigData_velocityIterations_set(swigCPtr, this, value);
  }

  public int getVelocityIterations() {
    return SoftbodyJNI.SoftBodyConfigData_velocityIterations_get(swigCPtr, this);
  }

  public void setPositionIterations(int value) {
    SoftbodyJNI.SoftBodyConfigData_positionIterations_set(swigCPtr, this, value);
  }

  public int getPositionIterations() {
    return SoftbodyJNI.SoftBodyConfigData_positionIterations_get(swigCPtr, this);
  }

  public void setDriftIterations(int value) {
    SoftbodyJNI.SoftBodyConfigData_driftIterations_set(swigCPtr, this, value);
  }

  public int getDriftIterations() {
    return SoftbodyJNI.SoftBodyConfigData_driftIterations_get(swigCPtr, this);
  }

  public void setClusterIterations(int value) {
    SoftbodyJNI.SoftBodyConfigData_clusterIterations_set(swigCPtr, this, value);
  }

  public int getClusterIterations() {
    return SoftbodyJNI.SoftBodyConfigData_clusterIterations_get(swigCPtr, this);
  }

  public void setCollisionFlags(int value) {
    SoftbodyJNI.SoftBodyConfigData_collisionFlags_set(swigCPtr, this, value);
  }

  public int getCollisionFlags() {
    return SoftbodyJNI.SoftBodyConfigData_collisionFlags_get(swigCPtr, this);
  }

  public SoftBodyConfigData() {
    this(SoftbodyJNI.new_SoftBodyConfigData(), true);
  }

}
