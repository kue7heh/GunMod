package com.kue7heh.bumba.Items.Guns;

import io.redspace.irons_artifice.client.sounds.GunShotSoundSettings;
import io.redspace.irons_artifice.data.*;
import io.redspace.irons_artifice.gun.ArmPoseKind;
import io.redspace.irons_artifice.gun.GunProfile;
import io.redspace.irons_artifice.registry.SoundRegistry;
import net.minecraft.sounds.SoundEvents;

public class bumbaguns {

    public static final GunProfile HANDCANNON = GunProfile.builder(30, 6, 110, FireMode.AUTO, ArmPoseKind.RIFLE,
                    ShotComponentTemplate.builder(18, 2, 0.3, 10, RecoilProfile.of(15f, .85f, 2f, 999))
                            .bulletSpeedMultiplier(1.5)
                            .projectileCount(1)
                            .gunshotSound(
                                    GunShotSoundSettings.standardShot(SoundRegistry.BLUNDERBUSS_SHOOT, 0.7f),
                                    GunShotSoundSettings.standardEcho(SoundRegistry.BULLET_ECHO_MUZZLELOADER, 0.75f),
                                    PlayableSound.holder(SoundEvents.DISPENSER_FAIL))
                            .muzzleFlash(MuzzleFlashType.LARGE)
                            .build())
            .reloadCues(ReloadCueStack.of(
                    new ReloadCue(0.63f, PlayableSound.of(SoundRegistry.ARQUEBUS_OPEN_BREECH, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1.42f, PlayableSound.of(SoundRegistry.CLOCKWORK_RIFLE_EJECT_MAG, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(4.4f, PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_CLOSE, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(4.83f, PlayableSound.of(SoundRegistry.ARQUEBUS_CLOSE_BREECH, 1.25f, 0.9f, 1.1f))
            ))
            .equipSound(PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_CLOSE, 0.75f, 0.9f, 1.1f))
            .build();
    public static final GunProfile GATLINGGUN = GunProfile.builder(100, 5, 110, FireMode.AUTO, ArmPoseKind.RIFLE,
                    ShotComponentTemplate.builder(6, 2, 0.05, 3, RecoilProfile.of(5f, .35f, 2f, 999))
                            .projectileCount(1)
                            .gunshotSound(
                                    GunShotSoundSettings.standardShot(SoundRegistry.CLOCKWORK_RIFLE_SHOOT, 1.2f),
                                    GunShotSoundSettings.standardEcho(SoundRegistry.BULLET_ECHO_MUZZLELOADER, 0.75f),
                                    PlayableSound.holder(SoundEvents.DISPENSER_FAIL))
                            .muzzleFlash(MuzzleFlashType.TRIANGLE)
                            .build())
            .reloadCues(ReloadCueStack.of(
                    new ReloadCue(0.63f, PlayableSound.of(SoundRegistry.ARQUEBUS_OPEN_BREECH, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1.42f, PlayableSound.of(SoundRegistry.CLOCKWORK_RIFLE_EJECT_MAG, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(4.4f, PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_CLOSE, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(4.83f, PlayableSound.of(SoundRegistry.ARQUEBUS_CLOSE_BREECH, 1.25f, 0.9f, 1.1f))
            ))
            .equipSound(PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_CLOSE, 0.75f, 0.9f, 1.1f))
            .build();
    public static final GunProfile M1 = GunProfile.builder(8, 5, 50, FireMode.SEMI, ArmPoseKind.RIFLE,
                    ShotComponentTemplate.builder(12, 1, 0.08, 5, RecoilProfile.of(20f, .35f, 2f, 999))
                            .projectileCount(1)
                            .gunshotSound(
                                    GunShotSoundSettings.standardShot(SoundRegistry.MUSKET_SHOOT, 1.0f),
                                    GunShotSoundSettings.standardEcho(SoundRegistry.BULLET_ECHO_MUZZLELOADER, 0.75f),
                                    PlayableSound.holder(SoundEvents.DISPENSER_FAIL))
                            .muzzleFlash(MuzzleFlashType.TRIANGLE)
                            .build())
            .reloadCues(ReloadCueStack.of(
                    new ReloadCue(0.38f, PlayableSound.of(SoundRegistry.CLOCKWORK_RIFLE_EJECT_MAG, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1.5f, PlayableSound.of(SoundRegistry.ARQUEBUS_LOAD, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1.85f, PlayableSound.of(SoundRegistry.ARQUEBUS_CLOSE_BREECH, 1.25f, 0.9f, 1.1f))
            ))
            .equipSound(PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_CLOSE, 0.75f, 0.9f, 1.1f))
            .build();
    public static final GunProfile DOUBLEBARRELSHOTGUN = GunProfile.builder(2, 5, 35, FireMode.SEMI, ArmPoseKind.RIFLE,
                    ShotComponentTemplate.builder(18, 2.5, 0.3, 1, RecoilProfile.of(25f, .35f, 2f, 999))
                            .projectileCount(8)
                            .gunshotSound(
                                    GunShotSoundSettings.standardShot(SoundRegistry.BLUNDERBUSS_SHOOT, 0.9f),
                                    GunShotSoundSettings.standardEcho(SoundRegistry.BULLET_ECHO_MUZZLELOADER, 0.75f),
                                    PlayableSound.holder(SoundEvents.DISPENSER_FAIL))
                            .muzzleFlash(MuzzleFlashType.LARGE)
                            .build())
            .reloadCues(ReloadCueStack.of(
                    new ReloadCue(0.63f, PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_OPEN, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1f, PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_LOAD, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1.25f, PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_CLOSE, 1.25f, 0.9f, 1.1f))
            ))
            .equipSound(PlayableSound.of(SoundRegistry.BLUNDERBUSS_RELOAD_CLOSE, 0.75f, 0.9f, 1.1f))
            .build();
}
