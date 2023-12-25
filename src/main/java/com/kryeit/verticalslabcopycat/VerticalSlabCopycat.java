package com.kryeit.verticalslabcopycat;

import com.kryeit.verticalslabcopycat.entry.ModBlocks;
import com.simibubi.create.Create;

import com.simibubi.create.foundation.data.CreateRegistrate;

import io.github.fabricators_of_create.porting_lib.entity.events.living.LivingEntityEvents;
import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerticalSlabCopycat implements ModInitializer {
	public static final String ID = "verticalslabcopycat";
	public static final String NAME = "Vertical Slab Copycat";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);

		ModBlocks.register();
		LivingEntityEvents.JUMP.register((listener) -> {
			if (listener instanceof ServerPlayer player) {
				System.out.println("wdwdwdw");
				player.setItemInHand(InteractionHand.MAIN_HAND, ModBlocks.VERTICAL_SLAB_COPYCAT.asStack());
			}
		});
	}
}
